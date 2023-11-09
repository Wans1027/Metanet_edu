package Java_Basic_05_OOP;

import Java_Basic_05_OOP.kosa.Pclass;

class Dclass {
    public int i;
    private int p;
    int s; // default
    protected int k; //default와 동일 (상속이 아니면 사용하지 않는다.) 상속관계에서 자식은 부모의 protected 자원을 사용가능

}
class Child2 extends Pclass{ //Heap 에는 부모가 먼저 올라감
    void method() {
        this.k = 100;
    }

    @Override
    protected void m() {
        super.m();
    }
}
public class Ex06_inherit_Protected {
    public static void main(String[] args) {

    }
}
