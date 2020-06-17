import java.util.Scanner;

class NumToKor {
    public static void main(String[] args) {
        // 사용자 0~99 정수 입력
        // 한글표기식 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("0~99 사이의 숫자를 입력하세요");
        int num = scanner.nextInt();
        String zero = "영", one = "일", two = "이", three = "삼", four = "사", five = "오",
                six = "육", seven = "칠", eight = "팔", nine = "구", ten = "십", fowardtot = "", backtot = "";

        int forwardnum, backnum;

        if (num >= 100 || num < 0) {
            System.out.println("잘못된 값입니다.");
            return;
        }

        forwardnum = num / 10;
        backnum = num % 10;

        if (forwardnum == 0) {
        } else if (forwardnum == 1) {
            fowardtot = ten;
        } else if (forwardnum == 2) {
            fowardtot = two + ten;
        } else if (forwardnum == 3) {
            fowardtot = three + ten;
        } else if (forwardnum == 4) {
            fowardtot = four + ten;
        } else if (forwardnum == 5) {
            fowardtot = five + ten;
        } else if (forwardnum == 6) {
            fowardtot = six + ten;
        } else if (forwardnum == 7) {
            fowardtot = seven + ten;
        } else if (forwardnum == 8) {
            fowardtot = eight + ten;
        } else if (forwardnum == 9)
            fowardtot = nine + ten;


        if( forwardnum == 0 && backnum == 0 ) {
            backtot = zero;
        } else if ( backnum == 1 ) {
            backtot = one;
        } else if ( backnum == 2) {
            backtot = two;
        } else if ( backnum == 3) {
            backtot = three;
        } else if ( backnum == 4) {
            backtot = four;
        } else if ( backnum == 5) {
            backtot = five;
        } else if ( backnum == 6) {
            backtot = six;
        } else if ( backnum == 7) {
            backtot = seven;
        } else if ( backnum == 8) {
            backtot = eight;
        } else if ( backnum == 9)
            backtot = nine;

        System.out.println(fowardtot + backtot);
    }
}