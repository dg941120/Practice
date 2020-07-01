import java.util.Scanner;

class CapitalQuiz {

    public static String questions(int a) {
        String[] Q = new String[10];

        Q[0] = "① 문제 : 캐나다의 수도는?\n   (a) 밴쿠버 (b) 토론토 (c) 오타와 (d) 재스퍼";
        Q[1] = "② 문제 : 미국의 수도는?\n   (a) 워싱턴 D.C. (b) 뉴욕 (c) 시카고 (d) 샌프란시스코";
        Q[2] = "③ 문제 : 일본의 수도는?\n   (a) 교토 (b) 오사카 (c) 도쿄 (d) 후쿠오카";
        Q[3] = "④ 문제 : 중국의 수도는?\n   (a) 광저우 (b) 상하이 (c) 충칭 (d) 베이징";
        Q[4] = "⑤ 문제 : 독일의 수도는?\n   (a) 베를린 (b) 뮌헨 (c) 함부르크 (d) 프랑크푸르트";
        Q[5] = "⑥ 문제 : 영국의 수도는?\n   (a) 맨체스터 (b) 런던 (c) 에든버러 (d) 옥스퍼드";
        Q[6] = "⑦ 문제 : 호주의 수도는?\n   (a) 시드니 (b) 멜버른 (c) 브리즈번 (d) 캔버라";
        Q[7] = "⑧ 문제 : 필리핀의 수도는?\n   (a) 세부 (b) 케손시티 (c) 마닐라 (d) 다바오";
        Q[8] = "⑨ 문제 : 대만의 수도는?\n   (a) 가오슝 (b) 타이페이 (c) 타이난 (d) 타이중";
        Q[9] = "⑩ 문제 : 러시아의 수도는?\n   (a) 상트페테르부르크 (b) 블라디보스토크 (c) 모스크바 (d) 볼고그라드";
        return Q[a];
    }

    public static boolean isPassed(int caNum) {
        boolean OX = true;
        if (caNum < 7) {
            OX = false;
        }
        return OX;
    }

    public static int correctAnswers(int[] userAnswer, int[] trueAnswer) {
        int caNum = 0;
        for (int i = 0; i < userAnswer.length; i++) {
            if (userAnswer[i] == trueAnswer[i]) {
                caNum++;
            }
        }
        return caNum;
    }

    public static int incorrectAnswers(int[] userAnswer, int[] trueAnswer) {
        int icaNum = 0;
        for (int i = 0; i < userAnswer.length; i++) {
            if (userAnswer[i] != trueAnswer[i]) {
                icaNum++;
            }
        }
        return icaNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] trueAnswer = {2, 0, 2, 3, 0, 1, 3, 2, 1, 2};
        int[] userAnswer = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(questions(i));
            System.out.println();
            System.out.println("정답을 입력해주세요.");
            System.out.println("a, b, c, d 로 입력해야합니다.");
            String userInput = scanner.next();
            System.out.println();
            userInput = userInput.toLowerCase();

            if (userInput.equals("a")) {
                userAnswer[i] = 0;
            } else if (userInput.equals("b")) {
                userAnswer[i] = 1;
            } else if (userInput.equals("c")) {
                userAnswer[i] = 2;
            } else if (userInput.equals("d")) {
                userAnswer[i] = 3;
            } else {
                System.out.println("잘못된 형식을 입력하셨습니다.");
                i--;
            }

        }
        if (isPassed(correctAnswers(userAnswer,trueAnswer))) {
            System.out.println("합격입니다!");
        } else {
            System.out.println("불합격입니다...");
        }
        System.out.println("정답 횟수 : " + correctAnswers(userAnswer,trueAnswer));
        System.out.println("오답 횟수 : " + incorrectAnswers(userAnswer,trueAnswer));
    }
}