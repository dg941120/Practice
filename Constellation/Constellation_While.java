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

        int birthMonth;
        while (true) {
            System.out.println("태어난 월을 입력하세요.");
            birthMonth = scanner.nextInt();
            if (birthMonth <= 12 & birthMonth >= 1) {
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("1 ~ 12 사이의 숫자로");
            }
        }

        int birthDay;
        while (true) {
            System.out.println("태어난 일을 입력하세요.");
            birthDay = scanner.nextInt();
            if (birthDay <= 31 & birthDay >= 1) {
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("1 ~ 31 사이의 숫자로");
            }
        }

        int lastDay;

        switch (birthMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
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

        while (true) {
            if (lastDay < birthDay) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println(birthMonth + "월은 " + birthDay + "일이 존재하지 않습니다.");
                System.out.println("태어난 일을 입력하세요.");
                birthDay = scanner.nextInt();
            } else {
                if (birthMonth == 1) {
                    if (birthDay >= 20) {
                        cons = "물병";
                    } else
                        cons = "염소";
                }

                if (birthMonth == 2) {
                    if (birthDay >= 19) {
                        cons = "물고기";
                    } else
                        cons = "물병";
                }

                if (birthMonth == 3) {
                    if (birthDay >= 21) {
                        cons = "양";
                    } else
                        cons = "물고기";
                }

                if (birthMonth == 4) {
                    if (birthDay >= 20) {
                        cons = "황소";
                    } else
                        cons = "양";
                }

                if (birthMonth == 5) {
                    if (birthDay >= 21) {
                        cons = "쌍둥이";
                    } else
                        cons = "황소";
                }

                if (birthMonth == 6) {
                    if (birthDay >= 22) {
                        cons = "게";
                    } else
                        cons = "쌍둥이";
                }

                if (birthMonth == 7) {
                    if (birthDay >= 23) {
                        cons = "사자";
                    } else
                        cons = "게";
                }

                if (birthMonth == 8) {
                    if (birthDay >= 23) {
                        cons = "처녀";
                    } else
                        cons = "사자";
                }

                if (birthMonth == 9) {
                    if (birthDay >= 24) {
                        cons = "천칭";
                    } else
                        cons = "처녀";
                }

                if (birthMonth == 10) {
                    if (birthDay >= 23) {
                        cons = "전갈";
                    } else
                        cons = "천칭";
                }

                if (birthMonth == 11) {
                    if (birthDay >= 23) {
                        cons = "궁수";
                    } else
                        cons = "전갈";
                }

                if (birthMonth == 12) {
                    if (birthDay >= 25) {
                        cons = "염소";
                    } else
                        cons = "궁수";
                }

                System.out.println(name + "님의 별자리는 " + cons + "자리입니다.");
                break;
            }
        }
    }
}