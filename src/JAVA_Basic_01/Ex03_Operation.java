package JAVA_Basic_01;

import java.util.Scanner;

public class Ex03_Operation {
    /*
     byte + short >> 내부적으로 컴파일러가 int + int
     char + char >> int + int
     int + long >> long
     정수 + 실수 >> 타입 크기의 상관 없이 실수가 승자
     */
    /*
    for
    while
    do ~ while 일단 한번은 강제적으로 수행
    do{실행문} while(boolean)
    Ex) 메뉴 구성

    Integer 매퍼 클래스
     */

    public static void main(String[] args) {
        int rival = (int) (Math.random() * 3) + 1;

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("*********************************");
            System.out.println("1. 가위 | 2. 바위 | 3. 보");
            System.out.println("****** 이길 경우 종료 ******");
            int input = Integer.parseInt(sc.nextLine());
            if(input - rival == 0){
                System.out.println("비김");
                continue;
            }
            String result = ((input - rival == 1 )|| (input -rival == -2))? "승리": "패배";
            System.out.println(result);
            if(result.equals("승리")) break;
        }
    }


}
