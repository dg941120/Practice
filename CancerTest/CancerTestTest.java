// 이름, 주민등록번호 입력, 무료 암검진 대상자 확인, 무료 암검진 항목 출력
// 처리조건 : 암검진 대상자 = 나이 40 이상, 해당년도가 홀수이면 홀수년도 출생자, 짝수이면 짝수년도 출생자
// 나이가 40세 이상 남자 = 무료 암검진 항목 (간암, 위암)
// 나이가 40세 이상 여자 = 무료 암검진 항목 (간암, 위암, 유방암, 자궁암)
// 나이가 50세 이상 남자 = 무료 암검진 항목 (간암, 위암, 대장암)
// 나이가 50세 이상 여자 = 무료 암검진 항목 (간암, 위암, 대장암, 유방암, 자궁암)

import java.util.Calendar;
import java.util.Scanner;

class CancerTest {
    private String name;
    private String gender;
    private int age;
    private String personalNum;
    private boolean isCancerTester;

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        this.name = scanner.next();
    }

    public String getGender() {
        return gender;
    }

    public void setGender() {
        if (getPersonalNum().substring(7, 8).equals("1") | getPersonalNum().substring(7, 8).equals("3")) {
            this.gender = "남자";
        } else {
            this.gender = "여자";
        }
    }

    public int getAge() {
        return age;
    }

    public int thisYear() {
        Calendar calendar = Calendar.getInstance();
        int thisYear = calendar.get(Calendar.YEAR);
        return thisYear;
    }

    public int birthYear() {
        int birthYear = Integer.parseInt(getPersonalNum().substring(0, 2));

        if (generationChecker()) {
            birthYear = 1900 + birthYear;
        } else {
            birthYear = 2000 + birthYear;
        }
        return birthYear;
    }

    public int setAge() {
        this.age = thisYear() - birthYear() + 1;
        return this.age;
    }

    public boolean generationChecker() {
        int check = Integer.parseInt(getPersonalNum().substring(7, 8));
        boolean checkResult;
        if (check == 1 | check == 3) {
            checkResult = true;
        } else {
            checkResult = false;
        }
        return checkResult;
    }

    public String getPersonalNum() {
        return personalNum;
    }

    public void setPersonalNum() {
        Scanner scanner = new Scanner(System.in);
        String forwardPn = "";
        String backPn = "";
        for (int i = 0; i < 1; i++) {
            System.out.println("주민등록번호 앞자리 6자리를 입력해주세요");
            forwardPn = scanner.next();
            int birthMonth = Integer.parseInt(forwardPn.substring(2, 4));
            int birthDay = Integer.parseInt(forwardPn.substring(4, 6));
            if (forwardPn.length() != 6 | birthMonth > 12 | birthMonth < 0 | birthDay < 0 | birthDay > 31) {
                System.out.println("잘못된 값을 입력하셨습니다.");
                i--;
            }
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("주민등록번호 뒷자리 7자리를 입력해주세요");
            backPn = scanner.next();
            int backNum = Integer.parseInt(backPn.substring(0, 1));
            if (backPn.length() != 7 | backNum < 0 | backNum > 4) {
                System.out.println("잘못된 값을 입력하셨습니다.");
                i--;
            }
        }

        this.personalNum = forwardPn + "-" + backPn;
    }

    public boolean getCancerTester() {
        return isCancerTester;
    }

    public void setCancerTester() {
        if (getAge() >= 40 & ((thisYear() % 2) == (birthYear() % 2))) {
            isCancerTester = true;
        } else {
            isCancerTester = false;
        }
    }

    public void CancerTestList() {
        String[] c = {"간암 ", "위암 ", "대장암 ", "유방암 ", "자궁암 "};

        if (getGender().equals("남자") & getCancerTester()) {
            if (getAge() >= 50) {
                System.out.println(getName() + "님은 " + getAge() + "세로 무료 암검진 항목은 " + c[0] + c[1] + c[2] + " 입니다.");
            } else {
                System.out.println(getName() + "님은 " + getAge() + "세로 무료 암검진 항목은 " + c[0] + c[1] + " 입니다.");
            }
        } else if (getGender().equals("여자") & !getCancerTester()) {
            if (getAge() >= 50) {
                System.out.println(getName() + "님은 " + getAge() + "세로 무료 암검진 항목은 " + c[0] + c[1] + c[2] + c[3] + c[4] + "입니다.");
            } else {
                System.out.println(getName() + "님은 " + getAge() + "세로 무료 암검진 항목은 " + c[0] + c[1] + c[3] + c[4] + "입니다.");
            }
        } else {
            System.out.println(getName() + "님은 " + getAge() + "세로 무료 암검진 대상자가 아닙니다.");
        }
    }
}

public class CancerTestTest {
    public static void main(String[] args) {
        CancerTest ct = new CancerTest();
        ct.setName();
        ct.setPersonalNum();
        ct.setGender();
        ct.setAge();
        ct.setCancerTester();
        ct.CancerTestList();
    }
}