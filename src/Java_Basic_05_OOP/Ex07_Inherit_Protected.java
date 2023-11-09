package Java_Basic_05_OOP;

import Java_Basic_05_OOP.kosa.Bird;

class Bi extends Bird {
    @Override
    protected void moveFast() {
        super.moveFast(); //public 상속관계
    }
}

class Ostrich extends Bird {
    void run(){
        System.out.println("날지못해 뛰다");
    }

    @Override
    protected void moveFast() {
        run();
    }
}

public class Ex07_Inherit_Protected {
    public static void main(String[] args) {
        Bi bi = new Bi();
        bi.fly();
        bi.moveFast();

        Ostrich ostrich = new Ostrich();
        ostrich.moveFast();
    }
}
