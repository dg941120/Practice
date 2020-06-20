import java.util.Scanner;

class Fib_30 {
    public static void main(String[] args) {
        int arr[] = new int[30]; // 30개의 배열을 만드는 것. 배열은 0 ~ 29가 생성.
        int x = 1, y = 1, total = 0, loop = 1;
        arr[0] = 1;
        arr[1] = 1;

        for(; loop < arr.length ; loop++) {
            arr[loop] = total;
            total = x + y;
            x = y;
            y = total;
        }
        System.out.println("30번째 항 : " + arr[29]);
    }
}

class Fib_New {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("원하는 항을 입력하시오.");
        int input = scan.nextInt();
        int arr[] = new int[input + 1];             // ex) 인풋 = 2, 새로 만들 배열의 갯수 [3] (0, 1, 2)
        int x = 1, y = 1, total = 1;

        arr[0] = 1;
        arr[1] = 1;

        for(int loop = 1; loop < arr.length ; loop++) {     // loop == 1 < arr[2] = 0 이 될 때까지 loop
            arr[loop] = total;                  // arr[2] = 1 == total = 1
            total = x + y;                      // total = 1 == x = 1 + y = 1 --> total = 2
            x = y;                              // x = 1 == y = 1
            y = total;                          // y = 1 == total = 2 --> y == 2
        }
        System.out.println("원하는 항 : " + (arr[input - 1])); // 원하는 항 : arr[0]
    }
}

class Fib_Num {
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
