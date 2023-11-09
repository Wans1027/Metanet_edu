package Java_Basic_05_OOP;
/*
DB > Emp(deptno(fk)) ...Dept (deptno(pk), dname, loc) : master detail
user(사용자)     provider(제공자)
class A {}
class B {}

관계 : A는 B를 사용합니다
1. 상속 : A extends B
2. 포함 : A 라는 클래스가 B를 (member field(부품)) 사용 class A { B b;}
__ 포함은 나눠짐 __
2.1 부분 (생명주기 : 동일하지 않음)
2.2 전체 (생명주기 : 동일)

class B {}
class A {
    int i;
    //A는 B를 사용합니다 (포함)
    B b; //2.1
    A(){ b = new B(); } //2.2
}
>>> main(){
    A a = new A();
    a = null;
    //A B 생명주기 동일; 전체집합
}

포함관계
B는 독자생성 가능 >> A라는 객체가 생성되면 B 생성
전체 집합
>> 자동차와 엔진, 노트북과 cpu
______________________________________________________
class B{
}
class A{
    int i;
    B b;
    A(){  }
    //method
    void method(B b){
        this.b = b;
    }
}
>> main(){
    A a = new A();//A가 죽어도 B는 살아있다
    B b = new B();
    //필요에 따라
    a.method(b);
    //부분집합
}
부분집합
>> 노트북과 마우스, 학교 학생

A는 B를 사용합니다(참조) >> 포함 >> A가 B를 member field >> 생성(전체), 따로(부분)

그리고 의존 (함수안에서) create, local, parameter 그래서 의존 메서드라고도 불림
 */
public class Ex15_User_Provider {
}
