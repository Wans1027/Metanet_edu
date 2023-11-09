package JAVA_Basic_03_OOP.kr.or.kosa;
public class Person {
    public String name;
    public int age;
    public boolean power;
    //초기값을 정하지 않는 이유는 생성되는 객체마다 다른 값을 가질 수 있다. 생성자를 통해서

    public void personPrint(){
        System.out.printf("이름은 %s 나이는 %d 파워는 %s 입니다 \n", name, age, power);
    }
}
