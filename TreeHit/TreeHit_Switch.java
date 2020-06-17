import java.util.Scanner;

public class TreeHit_Switch {
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
                    System.out.println("나무를 도끼로 찍지 않았습니다. 지금까지 도끼로 나무를 " + treeHit + "번 찍었습니다.")
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
