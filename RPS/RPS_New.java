import java.util.Scanner;
import java.util.Random;

class RPS_New /* RockPaperScissors_New */ {
    public static void main(String[] args) {
        String[] rps = {"가위", "바위", "보"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String user = "";
        int userRps;

        while (true) {
            System.out.println("가위, 바위, 보");
            user = scanner.next();
            if (user.equals(rps[0])) {
                userRps = 0;
                break;
            } else if (user.equals(rps[1])) {
                userRps = 1;
                break;
            } else if (user.equals(rps[2])) {
                userRps = 2;
                break;
            } else {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("보기에서 선택해주세요.");
            continue;
            }
        }

        int com = random.nextInt(3);
        System.out.println("당신은 " + rps[userRps] + "를 냈습니다.");
        System.out.println("컴퓨터는 " + rps[com] + "를 냈습니다.");

        if (userRps == com) {
            System.out.println("서로 비겼습니다.");
        } else if (userRps == 0 & com == 2 || userRps == 1 & com == 0 || userRps == 2 & com == 1) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("당신은 졌습니다...");
        }
    }
}