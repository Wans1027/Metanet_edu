package JAVA_Basic_03_OOP;

import JAVA_Basic_03_OOP.kr.or.kosa.Tv;
/*
하나의 함수는 '하나의 기능' 만 구현
** 모든 함수는 호출에 의해서만 동작한다 **

함수는 이름을 길게 지어라
함수이름만 봐도 어떤 기능인지 알 수 있게끔..

Ex) 사원테이블에서 사원의 모든 정보를 가지고 오는 함수
void getEmpAllList()

 */

class Fclass{
    private int subSum(int i) { //private 의도: 클래스 내에서 다른 함수를 도와주는 함수
        return i + 100;
    }

    public int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}
public class Ex02_Method_Call {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.brandName = "삼성";
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        System.out.println(tv.toString());
        tv.channelDown();
        System.out.println(tv.toString());
    }
}
