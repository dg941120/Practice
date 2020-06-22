/*
   생년 / 월 / 일 / 시 가 필요함.
   년은 띠나 십이지로, 월과 일은 음력으로 입력하라고 사용자에게 요청.

   년 - 입력한 띠나 십이지를 이용해 그대로 풀이함.

   월 - 사용자가 입력한 띠가 시작점.
         월의 숫자만큼 시작점에서 움직이며, 시작점도 이동횟수에 포함함.
         풀이는 이동해서 멈춘 지점.

   일 - 월에서 이동하여 멈춘 지점이 시작점.
         일의 숫자만큼 시작점에서 움직이며, 시작점도 이동횟수에 포함함.
         풀이는 이동해서 멈춘 지점.

   시 - 일에서 이동하여 멈춘 지점이 '자' 가되고 시작점이 됨.
         자신의 시에 도달할 때까지 시작점에서 움직이며, 시작점도 이동횟수에 포함함.
         ex) 미시일 경우, 시작점인 '자' 에서 자신인 '미' 까지 움직이는 것.
 */

import java.util.Calendar;
import java.util.Scanner;

class FCEC_Year_Over1900 { // Four columns and eight characters (사주팔자, 생년, 1900년생 이상만)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        System.out.println("성명을 입력해주세요.");
        String name = scanner.next();

        System.out.println("자신이 태어난 년도를 입력해주세요.");
        System.out.println("※ 1900년생 이후부터 가능합니다.");
        int year = scanner.nextInt();

        System.out.println("자신이 태어난 월을 음력으로 입력해주세요.");
        int month = scanner.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("월을 잘못 입력하셨습니다.");
            return;
        }
        // 월의 범위인 1 ~ 12를 벗어날 경우 return;

        System.out.println("자신이 태어난 일을 음력으로 입력해주세요.");
        int day = scanner.nextInt();
        if (day > 31 || day < 1) {
            System.out.println("일을 잘못 입력하셨습니다.");
            return;
        /*} else {
            switch (month) {
                case 2:
                    if (day > 29) {
                        System.out.println("일을 잘못 입력하셨습니다");
                        return;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day > 30) {
                        System.out.println("일을 잘못 입력하셨습니다");
                        return;
                    }
                    // 각 월별 마지막 일수를 초과할 경우에도 return 시키려 했으나,
                    음력은 매 해마다 월별 끝나는 일수가 달라 주석처리함.
                    */
        }

        // 일의 범위인 1 ~ 31을 벗어날 경우 return;

        System.out.println("자신이 태어난 시를 분을 제외하고 24시간 형식으로 입력해주세요.");
        int hour = scanner.nextInt();
        if (hour > 24 || hour < 0) {
            System.out.println("시를 잘못 입력하셨습니다.");
            return;
        }
        // 시의 범위인 0 ~ 24를 벗어날 경우 return;

        int today = cal.get(Calendar.YEAR);
        final String mean = "귀액권파인문복고역간수명";
        // 풀이로써, .substring 으로 가져오기 위한 String 임.

        if (year == 1900) {
            year = 1;
        } else if (year >= 1900 || today >= year) {
            year = year - 1888;
            for (int i = 12; i < year; ) {
                year -= 12;
            }
            year = year + 1;
        } else {
            System.out.println("생년을 잘못 입력하셨습니다.");
            return;
        }
        // 생년으로 가능하도록 만들었다.

        String animal = "";

        if (year == 1) {
            animal = "쥐";

        } else if (year == 2) {
            animal = "소";

        } else if (year == 3) {
            animal = "범";

        } else if (year == 4) {
            animal = "토끼";

        } else if (year == 5) {
            animal = "용";

        } else if (year == 6) {
            animal = "뱀";

        } else if (year == 7) {
            animal = "말";

        } else if (year == 8) {
            animal = "양";

        } else if (year == 9) {
            animal = "원숭이";

        } else if (year == 10) {
            animal = "닭";

        } else if (year == 11) {
            animal = "개";

        } else if (year == 12) {
            animal = "돼지";
        }
        // 마지막에 알려줄 자신의 띠를 위한 if 문

        String ans1 = "천" + mean.substring(year - 1, year);
        // 첫번째 사주풀이

        int monthmove = (year - 1) + month;
        // 시작 자리를 포함하기 때문에 - 1.

        if (monthmove > 12) {
            if ((monthmove %= 12) == 0) {
                monthmove = 12;
            } else {
                monthmove %= 12;
            }
        }
        // 12보다 클 경우 mean 에서 가져올 수가 없다. 그렇기에 12로 나누어 주어 나머지를 가져옴.
        // 그런데 만약 12의 배수일경우 0값이 나오기때문에 예외처리

        String ans2 = "천" + mean.substring(monthmove - 1, monthmove);
        // 두번째 사주풀이

        int daymove = (monthmove - 1) + day;

        if (daymove > 12) {
            if ((daymove %= 12) == 0) {
                daymove = 12;
            } else {
                daymove %= 12;
            }
        }
        // 위와 동일.

        String ans3 = "천" + mean.substring(daymove - 1, daymove);
        // 세번째 사주풀이

        int hourmove = 0;

        switch (hour) {
            case 23:
            case 0:
                hourmove = 1;
                break;
            case 1:
            case 2:
                hourmove = 2;
                break;
            case 3:
            case 4:
                hourmove = 3;
                break;
            case 5:
            case 6:
                hourmove = 4;
                break;
            case 7:
            case 8:
                hourmove = 5;
                break;
            case 9:
            case 10:
                hourmove = 6;
                break;
            case 11:
            case 12:
                hourmove = 7;
                break;
            case 13:
            case 14:
                hourmove = 8;
                break;
            case 15:
            case 16:
                hourmove = 9;
                break;
            case 17:
            case 18:
                hourmove = 10;
                break;
            case 19:
            case 20:
                hourmove = 11;
                break;
            case 21:
            case 22:
                hourmove = 12;
                break;
        }
        // switch 문으로 입력한 시간을 그에 대응하는 십이지 값으로 바꿈.

        int hdmove = (hourmove - 1) + daymove;
        // - 1 은 초기값을 0으로 두는 바람에 case 문에서 1부터 시작해서 넣어줌.
        // 이렇게 되면 세번째 풀이가 끝난 부분을 '자' 로 치환하여 두번째랑 세번째 사주풀이처럼 시작할 수 있다.

        if (hdmove > 12) {
            if ((hdmove %= 12) == 0) {
                hdmove = 12;
            } else {
                hdmove %= 12;
            }
        }

        String ans4 = "천" + mean.substring(hdmove - 1, hdmove);
        // 네번째 사주풀이.

        System.out.println(animal + "띠인 " + name + "님의 사주는 " + ans1 + ", " + ans2 + ", " + ans3 + ", " + ans4 + "입니다.");
    }
}