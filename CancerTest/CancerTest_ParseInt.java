import java.util.Calendar;
import java.util.Scanner;

// 사용자에게 이름과 주민등록번호를 입력받아 무료 암검진 대상자인지 구별하는 프로그램.
// 무료 암검진 대상자는 나이가 40세 이상, 올해가 짝수년도면 짝수년도 출생자, 홀수년도면 홀수년도 출생자.

class CancerTest_ParseInt{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        String name, idnum;
        int nowyear, age;

        System.out.println("이름을 입력하세요");
        name = scan.next();

        System.out.println("'-' 를 제외한 주민등록번호 13자리를 입력하세요");
        idnum = scan.next();

        nowyear = cal.get(Calendar.YEAR);

            if (Integer.parseInt(idnum.substring(6,7)) > 2) {
            age = nowyear - (2000 + Integer.parseInt(idnum.substring(0,2)));
            } else
            age = nowyear - (1900 + Integer.parseInt(idnum.substring(0,2)));

            if (age >= 40 && age % 2 == 0 && nowyear % 2 == 0 || age >= 40 && age % 2 == 1 && nowyear % 2 == 1) {
                System.out.println(name + "님은 " + age + "세이며, 무료 암검진 대상자입니다.");
            } else
                System.out.println(name + "님은 " + age + "세이며, 무료 암검진 대상자가 아닙니다.");
    }
}