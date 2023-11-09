package Java_Basic_05_OOP.kosa;
/*
디자인 패턴 (생성에 관련된 이야기) :new
싱글톤 : 객체 하나를 만들어 공유 satic
의도 : 하나의 객체를 공유하는 보장성 코드를 만들어라
//new 가 보이지않게 private으로 막아라!
 */
public class Singleton {
    private static Singleton p;
    private Singleton(){ //new 못함

    }

    public static Singleton getInstance() { //객체를 돌려준다.
        if(p == null){
            p = new Singleton(); //내부에서는 생성자 호출 가능
        }
        return p;
    }
}
