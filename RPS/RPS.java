class RPS /* RockPaperScissors */ {
    public static void main(String[] args) {
        String[] rps = {"가위", "바위", "보"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int user = 0;

        while (true) {
            System.out.println("가위 : 1, 바위 : 2, 보 : 3");
            user = scanner.nextInt();
            if (user >= 1 & user <= 3) {
                user = user - 1;
                break;
            }
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("보기에서 선택해주세요.");
            continue;
        }

        int com = random.nextInt(3);
        System.out.println("당신은 " + rps[user] + "를 냈습니다.");
        System.out.println("컴퓨터는 " + rps[com] + "를 냈습니다.");

        if (user == com) {
            System.out.println("서로 비겼습니다.");
        } else if (user == 0 & com == 2 || user == 1 & com == 0 || user == 2 & com == 1) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("당신은 졌습니다...");
        }
    }
}