import java.util.Scanner;

class NumToKor_New {
    public static void main(String[] args) {
        // 사용자 0~99 정수 입력
        // 한글표기식 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("0~99 사이의 숫자를 입력하세요");
        int num = scanner.nextInt();
        String StrNum = "영일이삼사오육칠팔구", fowardtot = "", backtot = "";

        int forwardnum, backnum;

        if (num >= 100 || num < 0) {
            System.out.println("잘못된 값입니다.");
            return;
        }

        forwardnum = num / 10;
        backnum = num % 10;

        fowardtot = StrNum.substring(forwardnum, forwardnum + 1);
        backtot = StrNum.substring(backnum, backnum + 1);
        if (forwardnum == 1) {
            System.out.println("십" + backtot);
        } else if (forwardnum != 0) {
            System.out.println(fowardtot + "십" + backtot);
        } else
            System.out.println(backtot);
    }
}