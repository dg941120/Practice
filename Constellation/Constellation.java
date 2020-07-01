/* 사용자 입력값 이름, 생월, 생일 받아서 별자리를 판별 후 출력.
 * ex) 이름을 입력하세요 -> 몇월달에 태어났나요 -> 몇일에 태어났나요 -> XXX님의 별자리는 XX자리입니다.
 * 일찍 끝날경우 pdf 선택문 제어문 */
/*
물병자리
1월 20일 ~ 2월 18일
물고기자리
2월 19일 ~ 3월 20일
양자리
3월 21일 ~ 4월 19일
황소자리
4월 20일 ~ 5월 20일
쌍둥이자리
5월 21일 ~ 6월 21일
게자리
6월 22일 ~ 7월 22일
사자자리
7월 23일 ~ 8월 22일
처녀자리
8월 23일 ~ 9월 23일
천칭자리
9월 24일 ~ 10월 22일
전갈자리
10월 23일 ~ 11월 22일
궁수자리
11월 23일 ~ 12월 24일
염소자리
12월 25일 ~ 1월 19일
 */

import java.util.Scanner;

class Constellation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = scanner.next();

        System.out.println("태어난 월을 입력하세요");
        int birth_month = scanner.nextInt();
        if (birth_month > 12 || birth_month < 1){
            System.out.println("잘못된 값을 입력하셨습니다");
            return;
        }

        System.out.println("태어난 일을 입력하세요");
        int birth_day = scanner.nextInt();
        if (birth_day > 31 || birth_day < 1){
            System.out.println("잘못된 값을 입력하셨습니다");
            return;
        }

        int lastDay;

        switch (birth_month) {
            case 1 : case 3 : case 5: case 7: case 8: case 10 : case 12:
                lastDay = 31;
                break;
            case 2:
                lastDay = 29;
                break;
            default:
                lastDay = 30;
                break;
        }

        String cons = "";
        if (lastDay > birth_day) {
            if (birth_month == 1) {
                if (birth_day >= 20) {
                    cons = "물병";
                } else
                    cons = "염소";
            }

            if (birth_month == 2) {
                if (birth_day >= 19) {
                    cons = "물고기";
                } else
                    cons = "물병";
            }

            if (birth_month == 3) {
                if (birth_day >= 21) {
                    cons = "양";
                } else
                    cons = "물고기";
            }

            if (birth_month == 4) {
                if (birth_day >= 20) {
                    cons = "황소";
                } else
                    cons = "양";
            }

            if (birth_month == 5) {
                if (birth_day >= 21) {
                    cons = "쌍둥이";
                } else
                    cons = "황소";
            }

            if (birth_month == 6) {
                if (birth_day >= 22) {
                    cons = "게";
                } else
                    cons = "쌍둥이";
            }

            if (birth_month == 7) {
                if (birth_day >= 23) {
                    cons = "사자";
                } else
                    cons = "게";
            }

            if (birth_month == 8) {
                if (birth_day >= 23) {
                    cons = "처녀";
                } else
                    cons = "사자";
            }

            if (birth_month == 9) {
                if (birth_day >= 24) {
                    cons = "천칭";
                } else
                    cons = "처녀";
            }

            if (birth_month == 10) {
                if (birth_day >= 23) {
                    cons = "전갈";
                } else
                    cons = "천칭";
            }


            if (birth_month == 11) {
                if (birth_day >= 23) {
                    cons = "궁수";
                } else
                    cons = "전갈";
            }

            if (birth_month == 12) {
                if (birth_day >= 25) {
                    cons = "염소";
                } else
                    cons = "궁수";
            }

            System.out.println(name + "님의 별자리는 " + cons + "자리입니다.");
        } else {
            System.out.println("잘못된 값을 입력하셨습니다");
        }
    }
}