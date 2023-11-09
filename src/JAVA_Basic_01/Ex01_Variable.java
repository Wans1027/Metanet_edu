package JAVA_Basic_01;
//클래스 == 설계도 == 데이터 타입
class Test{
	int data; //instance variable
	          //초기화 하지 않아도 됨.. default 값 0 을 가짐
}


public class Ex01_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		value = 100; // 초기화, 할당
		int age = 100; //선언과 할당을 동시에 ...
		//초기화 정의 : 변수의 초기화 : 변수가 처음 값을 갖는 것 (할당을 통해서)
		
		Test test = new Test(); //참조타입
		System.out.println(test.data);
		//클래스는 타입이다.
		Emp emp; //emp 라는 지역변수는 Emp 클래스 객체의 주소를 받을 준비 ...
		emp = new Emp();
		//캡슐화의 진정한 목적은 직접 할당을 막고 간접할당을 한다.
		//emp.setEmpno(100);
		//int empdata = emp.getEmpno();
		System.out.println(emp);
		Emp emp2 = emp;
		System.out.println(emp2 == emp);
		
		
		int a,b,c;
		a = 100;
		b = 200;
		c = 300;
		// int age = 200; 같은 지역 같은 변수 안됨...
		// int result = a + b;
		
		//변수가 선언되는 위치 
		//instance variable 클래스안에  >> class Car { public int door;}
		//local variable 함수안에 >> class Car { public void run(){int data = 0;}}
		//static variable: 공유자원 >> class Car{public static int num;}
		//블럭 변수 >> for(int i = 0; ....);
		
		
	}

}
