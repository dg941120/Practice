import java.util.Scanner;

class NumToKor {
    public static void main(String[] args) {
        // 사용자 0~99 정수 입력
        // 한글표기식 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("0~99 사이의 숫자를 입력하세요");
        int num = scanner.nextInt();
        String zero = "영", one = "일", two = "이", three = "삼", four = "사", five = "오",
                six = "육", seven = "칠", eight = "팔", nine = "구", ten = "십", forwardTot = "", backTot = "";

        int forwardNum, backNum;

        if (num >= 100 || num < 0) {
            System.out.println("잘못된 값입니다.");
            return;
        }

        forwardNum = num / 10;
        backNum = num % 10;

        if (forwardNum == 0) {
        } else if (forwardNum == 1) {
            forwardTot = ten;
        } else if (forwardNum == 2) {
            forwardTot = two + ten;
        } else if (forwardNum == 3) {
            forwardTot = three + ten;
        } else if (forwardNum == 4) {
            forwardTot = four + ten;
        } else if (forwardNum == 5) {
            forwardTot = five + ten;
        } else if (forwardNum == 6) {
            forwardTot = six + ten;
        } else if (forwardNum == 7) {
            forwardTot = seven + ten;
        } else if (forwardNum == 8) {
            forwardTot = eight + ten;
        } else if (forwardNum == 9)
            forwardTot = nine + ten;


        if( forwardNum == 0 && backNum == 0 ) {
            backTot = zero;
        } else if ( backNum == 1 ) {
            backTot = one;
        } else if ( backNum == 2) {
            backTot = two;
        } else if ( backNum == 3) {
            backTot = three;
        } else if ( backNum == 4) {
            backTot = four;
        } else if ( backNum == 5) {
            backTot = five;
        } else if ( backNum == 6) {
            backTot = six;
        } else if ( backNum == 7) {
            backTot = seven;
        } else if ( backNum == 8) {
            backTot = eight;
        } else if ( backNum == 9)
            backTot = nine;

        System.out.println(forwardTot + backTot);
    }
}