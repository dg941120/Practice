import java.util.Scanner;

class NumToKor_New {
    public static void main(String[] args) {
        // 사용자 0~99 정수 입력
        // 한글 표기식 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 ~ 99 사이의 숫자를 입력하세요");
        int num = scanner.nextInt();
        String strnum = "영일이삼사오육칠팔구", fwrdtot = "", backtot = "";

        int fwrdnum, backnum;

        if (num >= 100 || num < 0) {
            System.out.println("잘못된 값입니다.");
            return;
        }

        fwrdnum = num / 10;
        backnum = num % 10;

        fwrdtot = strnum.substring(fwrdnum, fwrdnum + 1);
        backtot = strnum.substring(backnum, backnum + 1);
        if (fwrdnum == 1) {
            System.out.println("십" + backtot);
        } else if (fwrdnum != 0) {
            System.out.println(fwrdtot + "십" + backtot);
        } else
            System.out.println(backtot);
    }
}