package JAVA_Basic_03_OOP;

import JAVA_Basic_03_OOP.kr.or.kosa.Person;

public class Ex01_Ref_Type {
    public static void main(String[] args) {
        Person person;
        person = new Person(); //생성자 함수 호출. ...
        person.name = "rla";
        person.age = 100;
        person.power = true;
        person.personPrint();
        System.out.println(person);//JAVA_Basic_03_OOP.kr.or.kosa.Person@10f87f48 //컴파일러가 알아서 toString
        System.out.println(person.toString());//JAVA_Basic_03_OOP.kr.or.kosa.Person@10f87f48

        Person person2 = new Person();
        System.out.println(person2.equals(person));

        Person person3 = person; //주소 참조
        System.out.println(person.equals(person3));

        //클래스 == 설계도 == 데이터 타입(사용자가 만든)
    }
}
