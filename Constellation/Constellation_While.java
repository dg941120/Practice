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

class Constellation_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요.");
        String name = scanner.next();

        int birth_month;
        while (true) {
            System.out.println("태어난 월을 입력하세요.");
            birth_month = scanner.nextInt();
            if (birth_month <= 12 & birth_month >= 1) {
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("1 ~ 12 사이의 숫자로");
            }
        }

        int birth_day;
        while (true) {
            System.out.println("태어난 일을 입력하세요.");
            birth_day = scanner.nextInt();
            if (birth_day <= 31 & birth_day >= 1) {
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("1 ~ 31 사이의 숫자로");
            }
        }

        int lastday;

        switch (birth_month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastday = 31;
                break;
            case 2:
                lastday = 29;
                break;
            default:
                lastday = 30;
                break;
        }

        String Cons = "";

        while (true) {
            if (lastday < birth_day) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println(birth_month + "월은 " + birth_day + "일이 존재하지 않습니다.");
                System.out.println("태어난 일을 입력하세요.");
                birth_day = scanner.nextInt();
            } else {
                if (birth_month == 1) {
                    if (birth_day >= 20) {
                        Cons = "물병";
                    } else
                        Cons = "염소";
                }

                if (birth_month == 2) {
                    if (birth_day >= 19) {
                        Cons = "물고기";
                    } else
                        Cons = "물병";
                }

                if (birth_month == 3) {
                    if (birth_day >= 21) {
                        Cons = "양";
                    } else
                        Cons = "물고기";
                }

                if (birth_month == 4) {
                    if (birth_day >= 20) {
                        Cons = "황소";
                    } else
                        Cons = "양";
                }

                if (birth_month == 5) {
                    if (birth_day >= 21) {
                        Cons = "쌍둥이";
                    } else
                        Cons = "황소";
                }

                if (birth_month == 6) {
                    if (birth_day >= 22) {
                        Cons = "게";
                    } else
                        Cons = "쌍둥이";
                }

                if (birth_month == 7) {
                    if (birth_day >= 23) {
                        Cons = "사자";
                    } else
                        Cons = "게";
                }

                if (birth_month == 8) {
                    if (birth_day >= 23) {
                        Cons = "처녀";
                    } else
                        Cons = "사자";
                }

                if (birth_month == 9) {
                    if (birth_day >= 24) {
                        Cons = "천칭";
                    } else
                        Cons = "처녀";
                }

                if (birth_month == 10) {
                    if (birth_day >= 23) {
                        Cons = "전갈";
                    } else
                        Cons = "천칭";
                }

                if (birth_month == 11) {
                    if (birth_day >= 23) {
                        Cons = "궁수";
                    } else
                        Cons = "전갈";
                }

                if (birth_month == 12) {
                    if (birth_day >= 25) {
                        Cons = "염소";
                    } else
                        Cons = "궁수";
                }

                System.out.println(name + "님의 별자리는 " + Cons + "자리입니다.");
                break;
            }
        }
    }
}