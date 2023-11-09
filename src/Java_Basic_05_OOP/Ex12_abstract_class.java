package Java_Basic_05_OOP;
/*
추상 클래스
>> 미완성 클래스 (설계도)
1. 완성된 코드 + 미완성 코드
2. 미완성(함수) >> 실행블럭이 없는 함수 >> public void run(); (x){}
3. 미완성된 클래스 (스스로 객체 생성이 불가능)

상속을 통해서만 쓰임 재정의를 통해
>> 미완성 설계도 제작(미완성 함수) >> 의도 >> 믿지 못하니까 >> 강제적 구현을 목적으로
 */

abstract class Abclass{
    int pos;
    void run() {
        pos++;
    }
    abstract void stop(); // 실행 블럭이 없다.. 반드시 상속을 통해서 구현 >> 재정의
}

class Child extends Abclass {
    @Override
    void stop() {
        //마음대로 구현
        this.pos = 0;
        System.out.println("stop:" + this.pos);
    }
}
public class Ex12_abstract_class { //
    public static void main(String[] args) {

    }
}
