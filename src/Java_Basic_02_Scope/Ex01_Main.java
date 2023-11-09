package Java_Basic_02_Scope;
/*
클래스 == 설계도 == 데이터 타입 (사용자 정의 )
클래스 구성요소 (설계도라고 판단 근거 .. 최소한의 무었이)
속성 + 기능
필드 + 메서드 (생성자 함수 : member field 초기화(생성되는 객체마다))
필드 (member field) >> 데이터 , 자료(정보) 담고 있다 >> [고유정보], [상태정보], [부품정보]

class 설계도 이름 {
    고유정보 : 제조회사 = 현대   , 이름 , 주민번호
    상태정보 : 자동차 설계도 >  속도
    부품정보 : 자동차 설계도 >  다른 클래스 > 엔진 (쪼갤수 있음)

    +
    기능(행위)
    +
    생성자 함수
}
class Engine{

}
class Car {
    String companyName;
    int speed;
    Engine engine;
}

클래스, 필드, 생성자 함수, 메서드 : 각자 영역(범위)이 있음 -> 생성되는 장소 또는 접근자

장소 (위치) : 폴더(package) 기반으로 클래스 내부, 함수 내부, 제어문 내부
접근자: public , private default, protected
 */

class Emp{

}
//Default는 같은 폴더 내에서 동작
class Dept{ //컴파일러가 default class Dept 연습할 때나 default
    int deptno; //컴파일러가 default int deptno
    public String dname; // ** class 자체가 Default 라 public 말고 private 써야됨 **
    private int count; //캡슐화 (은닉) 클래스 내부에서만 쓰겠다. 직접할당을 막고 간접 할당을 하겠다.
    //특수한 목적의 함수 Getter(읽기전용), Setter(쓰기전용)
    //멤버필드는 100% private

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if(count < 0){
            this.count = 0; //간접 할당  ->  제어
        }
        else this.count = count;
    }
}
public class Ex01_Main {
    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.deptno = 10;
    }
}
