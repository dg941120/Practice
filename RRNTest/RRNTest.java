import java.util.Scanner;

class ResidentRegistrationNumber {
    private String RRN;

    public String getRRN() {
        return RRN;
    }

    public void setRRN() {
        Scanner scanner = new Scanner(System.in);
        String frontRRN = "";
        String backRRN = "";

        for (int i = 0; i < 1; i++) {
            System.out.println("주민등록번호 앞자리 6자리를 입력해주세요.");
            frontRRN = scanner.next();
            if (frontRRN.length() != 6) {
                System.out.println("잘못된 값을 입력하셨습니다.");
                i--;
                continue;
            }
            i++;
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("주민등록번호 뒷자리 7자리를 입력해주세요.");
            backRRN = scanner.next();
            if (backRRN.length() != 7) {
                System.out.println("잘못된 값을 입력하셨습니다.");
                i--;
                continue;
            }
            i++;
        }

        RRN = frontRRN + '-' + backRRN;
    }

    public void checkRRN(String RRN) {
        char[] temp = new char[14];
        String[] temp2 = new String[14];
        int[] nums = new int[14];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = RRN.charAt(i);
            temp2[i] = String.valueOf(temp[i]);
            if (!temp2[i].equals("-")) {
                nums[i] = Integer.parseInt(temp2[i]);
            }
        }

        int checker = ((2 * nums[0]) + (3 * nums[1]) + (4 * nums[2]) + (5 * nums[3]) + (6 * nums[4]) + (7 * nums[5])
                + (8 * nums[7]) + (9 * nums[8]) + (2 * nums[9]) + (3 * nums[10]) + (4 * nums[11]) + (5 * nums[12]));

        if (nums[13] == ((11 - (checker % 11)) % 10)) {
            System.out.println("유효한 주민등록번호 입니다.");
        } else {
            System.out.println("유효하지 않은 주민등록번호 입니다.");
        }
    }
}

public class RRNTest {
    public static void main(String[] args) {
        ResidentRegistrationNumber RRN = new ResidentRegistrationNumber();
        RRN.setRRN();
        RRN.checkRRN(RRN.getRRN());
    }
}