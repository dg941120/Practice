import java.util.Scanner;

class Gugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("찾을 단을 입력해주세요 : ");
        int front1 = scan.nextInt();

        if (front1 > 9) {
            System.out.println("범위를 벗어났습니다. 종료합니다.");
        } else if (front1 <= 9) {
            System.out.println("곱할 수를 입력해주세요 : ");
            int back1 = scan.nextInt();
            if (back1 > 9) {
                System.out.println("범위를 벗어났습니다. 종료합니다.");
            } else System.out.println(front1 + " X " + back1 + " = " + front1 * back1);
        }
    }
}

class Gugudan_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("단을 입력해주세요.");
        int x = scan.nextInt();
        int y = 1;

        for (;y <= 9; y++) {
            System.out.println(x + " X " + y + " = " + x * y);
        }
    }
}

class Gugudan_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("찾고자 하는 단을 입력해주세요.");
        int dan = scan.nextInt();
        switch (dan) {
            case 1 :
                dan = 1;
                break;
            case 2 :
                dan = 2;
                break;
            case 3 :
                dan = 3;
                break;
            case 4 :
                dan = 4;
                break;
            case 5 :
                dan = 5;
                break;
            case 6 :
                dan = 6;
                break;
            case 7 :
                dan = 7;
                break;
            case 8 :
                dan = 8;
                break;
            case 9 :
                dan = 9;
                break;
            default:
                System.out.println("범위를 벗어났습니다. 종료합니다.");
                return;
        }
        System.out.println("곱할 수를 입력해주세요.");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                num = 1;
                break;
            case 2:
                num = 2;
                break;
            case 3:
                num = 3;
                break;
            case 4:
                num = 4;
                break;
            case 5:
                num = 5;
                break;
            case 6:
                num = 6;
                break;
            case 7:
                num = 7;
                break;
            case 8:
                num = 8;
                break;
            case 9:
                num = 9;
                break;
            default:
                System.out.println("범위를 벗어났습니다. 종료합니다.");
                return;
        }
        System.out.println( dan + " X " + num + " = " + dan * num );
    }
}