import java.util.Scanner;

class NumToKor_New {
    public static void main(String[] args) {
        // 사용자 0~99 정수 입력
        // 한글 표기식 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 ~ 99 사이의 숫자를 입력하세요");
        int num = scanner.nextInt();
        String strNum = "영일이삼사오육칠팔구", forwardTot = "", backTot = "";

        int forwardNum, backnum;

        if (num >= 100 || num < 0) {
            System.out.println("잘못된 값입니다.");
            return;
        }

        forwardNum = num / 10;
        backnum = num % 10;

        forwardTot = strNum.substring(forwardNum, forwardNum + 1);
        backTot = strNum.substring(backnum, backnum + 1);
        if (forwardNum == 1) {
            System.out.println("십" + backTot);
        } else if (forwardNum != 0) {
            System.out.println(forwardTot + "십" + backTot);
        } else
            System.out.println(backTot);
    }
}