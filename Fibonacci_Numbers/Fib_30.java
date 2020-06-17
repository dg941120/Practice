public class Fib_30 {
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
