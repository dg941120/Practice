import java.util.Scanner;

class TreeHit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int treeHit = 0;
        while (treeHit < 10) {
            System.out.println("나무를 도끼로 찍으시겠습니까? Y/N");
            String yorn = scan.next();
            if (yorn.equals("Y")) { treeHit++;
            // treeHit + 1 이 적용이 안 됐다. while 문이라 그런거 같다.
                System.out.println("나무를 도끼로 " + treeHit + "번 찍었습니다.");
            } else {
                continue;
                // continue 문의 첫 사용. 특정 구문에만 쓸 수 있는듯 하여 아쉽다.
            }
            if (treeHit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }
    }
}
// https://wikidocs.net/212 해당 사이트의 예제를 내가 원하는 대로 바꾸어 보았다.
// 원래는 treeHit++ 로 10까지 계속해서 수가 더해지는 것이었으나, if 로 사용자가 원할 때 오르게 바꾸었다.

class TreeHit_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int treeHit = 0;
        while (treeHit < 10) {
            System.out.println("나무를 도끼로 찍으시겠습니까? Y/N");
            String YorN = scan.next();
            switch (YorN) {
                case "Y":
                    treeHit += 1;
                    System.out.println("나무를 도끼로 찍었습니다. 지금까지 도끼로 나무를 " + treeHit + "번 찍었습니다.");
                    continue;
                case "N":
                    System.out.println("나무를 도끼로 찍지 않았습니다. 지금까지 도끼로 나무를 " + treeHit + "번 찍었습니다.");
                default:
            }
        }
        if (treeHit == 10) {
            System.out.println("나무가 넘어갑니다.");
            // 구문 위치 실수가 있었다. 중괄호 위치를 잘 봐야함.
        }
    }
}
// https://wikidocs.net/212 해당 사이트의 예제를 내가 원하는 대로 바꾸어 보았다.
// 원래는 treeHit++ 로 10까지 계속해서 수가 더해지는 것이었으나, while 과 switch 를 이용하여 사용자가 원할 때 오르게 바꾸었다.
