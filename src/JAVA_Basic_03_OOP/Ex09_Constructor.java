package JAVA_Basic_03_OOP;

/*
생성자 함수(constructor)
1. 특수한 목적 함수
2. 목적( member field  초기화) >> static {} ,  { 초기자 블럭 }

3. 일반 함수와 다른점
3.1 함수 이름이 고정(class 이름 동일)
3.2 return type 없어요 (객체 생성과 동실 호출) (return 을 받을 대상이 없다)
3.3 실행시점 > new 객체 생성 > heap 객체 생성 > member field 자리 > 자동으로 생성자 함수 호출
3.4 return type(x) >> void >> public void(생략) 클래스 이름 >> public 클래스이름(){}

4. 왜 만들까 : [생성되는 객체]마다 [강제적]으로 member field 초기화 하고 싶다

class Car { String color; }
>> 설계도를 만든이는 자동차 색상은 니가 알아서 해  (안해도 어쩔 수 없어)

class Car {String color="blue"}
>> 객체를 생성하면 무조건 자동차의 blue

문제) 자동차의 색상을 정하지 않고 출고
설계도를 사용하는 사람이 자동차를 만들때 색상을 넣지 않으면 출고 안되게 하고 싶어요
>> 생성자 설계 강제하지 않으면 객체 안 만들어 져요

5. 생성자 함수 1개 만들까 .... 
6. 생성자 함수는 overloading 가능 (강제 구현) ** Today Point
****  생성자 함수를 쓰는 가장 중요한 목적은  member field [강제적]  초기화

*/

class Car {
	String carName = "Pony";
	//구현하지 않으면 컴파일러가 자동으로 자동으로 생성자를 만든다.
	//Car(){} default ..

}
class Car2 {
	String carName;
	//오버로딩 생성자 함수가 하나라도 있으면 .. default 자동 생성 안되요
	//overloading 생성자 >> 강제성
	Car2(String carName) {
		this.carName = carName;
	}
}
public class Ex09_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
