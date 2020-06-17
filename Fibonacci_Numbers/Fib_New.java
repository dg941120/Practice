import java.util.Scanner;

public class Fib_New {
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
