package Java_Basic_05_OOP;

class Pbase { int p = 1000;}

class Cbase extends Pbase{ int c = 200;}

class Dbase extends Pbase{

}
public class Ex09_Inherit_Poly {
    public static void main(String[] args) {
        //상속관계에서 부모타입의 참조변수는 여러개의 자식타입 주소를 가질 수 있다(다형성)
        Cbase cbase = new Cbase();
        System.out.println(cbase.toString());

        //다형성
        Pbase pbase = cbase; //다형성
        Dbase dbase = new Dbase();
        pbase = dbase;//부모가 같으니까ㅏㅏ

        //자식은 부모에게 조건없이 드린다.
        //Cbase ccc = pbase; 부모에서 자식 안됨
        //down casting
        Cbase ccc = (Cbase) pbase;
    }
}
