import java.util.Scanner;

public class Fib_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 1, y = 1, total = 0, loop = 2, want = 0;
        System.out.println("몇번째 피보나치 항을 원하시나요?");
        want = scan.nextInt();
        if (want > 2) {
            for (; ; loop++) {
                if (want == loop) {
                    break;
                } else {
                    total = x + y;
                    x = y;
                    y = total;
                }
            }
            System.out.println("결과 값 : " + total);
        } else if (want > 0) {
            for (;want < 3;) {
                total = x + y;
                x = y;
                y = total;
                System.out.println("결과 값 : " + "1");
                break;
            }
        } else {
            System.out.println("잘못된 값을 입력했습니다.");
        }
    }
}
