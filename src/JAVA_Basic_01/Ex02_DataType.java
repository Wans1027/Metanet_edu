package JAVA_Basic_01;

public class Ex02_DataType {
	public static void main(String[] args) {
		//int는 -21~ 21억 까지
		int num = 100000000;
		System.out.println(num);
		
		//int num2 = 10000000000;
		//The literal 10000000000 of type int is out of range
		//개발자가 직접 입력한 값 literal (있는 그대로의 값)
		
		//개발자가 입력한 리터럴값의 범위는 int로 잡는다 자바는;
		//long num2 = 10000000000;
		long num2 = 10000000000L; //리터럴값에대한 범위때문에 L을 붙임
		long num3 = 100; //자동 형 변환 , 문제없음 //값을 보지말고 타입을 보자
		//long num3 = (long)100; 암시적 형변환 (컴파일러가 해줌)
		//작은 타입값을 큰 타입에 넣는 것은 문제가 되지 않음;
		
		int num4 = (int) 10000000000L;
		System.out.println(num4);//1410065408 쓰레기 값, 강제로 잘라버림
		
		long num5 = 10000000000L;
		
		int num6 = (int)1000L; 
		//강제적 형변환
		//1. 데이터 손실 주의.. 
		//받는 타입 을 크게 int ->  long
		
		//char 2byte >> 16 bit > 유니코드 > 아스키 코드표 >
		char ch = '가';
		//char ch2 = '가나';
		
		ch = 'a';
		ch = 'A';
		
		//char 정수 타입 호환
		int charint = ch;
		System.out.println(ch);//65
		char charint2 = 'a';
		int intchar = charint2;
		System.out.println(intchar);//97
		
		/*
		 정수 리터럴의 기본 타입은 int
		 실수 리터럴의 기본 타입은 double
		 
		 - 암시적 형변환, 명시적 형변환
		 큰 타입에 작은 타입을 넣는것을 암시적 형변환
		 작은 타입에 큰 타입을 넣고자 한다면 명시적 형변환 잘못은 개발자 책임
		 
		 */
		
		// 8가지 + String (기본 타입)
		// short, long, int, byte, char, double, float, boolean
		// String 값 타입 처럼 써도 문제 없어
		String name = "홍길동";
		
		//문제 없음
		//산술연산 결합연산
		String color  = "red";
		color = color + "방가방가";
		
		// java 특수문자 처리하기
		char sing = ' ';
		//이스케이프시퀀스 문자 : 특정 문자앞에 \ 붙이면 다음값은 데이터로 인정
		char sing2 = '\'';
		//quiz 홍"길"동
		String quizName = "홍\"길\"동";
		
		//quiz "C:\Temp" 문자열을 출력 (String) 변수에 담아서
		String quiz2 = "C:\\Temp";
		System.out.println(quiz2);
		
		//byte 네트워크 데이터 교환, 파일처리, 이미지 업로드 >> Array 처리
		//long 화폐처리
		
		
		//실수형
		//float 4, double 8
		//실수 리터럴의 기본타입은 double
		//float f = 3.14; 리터럴 에러
		float f = 3.14f; //데이터 손실
		//왠만하면 받는 그릇을 크게 double 로
		
		//** BigDecimal 정밀한 숫자 
		//double 에는 문제점이 있다. 검색좀
		
		
		double data3 = 100; //100.0
		double data4 = 100;
		int number = 100;
		int result2 = (int) (data4 + number); //큰 그릇을 작은 그릇으로 줄인 것 , 데이터 손실 가능성
		double result3 = data4 + number;//손실X
		
		/*
		 1. 큰타입 + 작은 타입 = 큰 타입
		 2. 타입간 변환은 변수가 가지고 있는 타입을 보자 -> 암시적, 명시적
		 3. 명시적 형변환시 손실을 가만하자
		 */
		
		int data5 = 100;
		byte b3 = (byte)data5; //명시적 강제 형변환
		//int data6 = (int)b4; 컴파일러에 의한 암시적 형변환
		
	}
}
