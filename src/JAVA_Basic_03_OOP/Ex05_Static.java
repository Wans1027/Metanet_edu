package JAVA_Basic_03_OOP;

import JAVA_Basic_03_OOP.kr.or.kosa.Airplane;

public class Ex05_Static {
    public static void main(String[] args) {
        //Airplane air1 = new Airplane();
        //air1.makePlane("대한항공", 200);

        //Airplane air2 = new Airplane();
       // air2.makePlane("대한항공2", 300);
        Airplane air1 = new Airplane("대한항공", 200);
        Airplane air2 = new Airplane("대한항공2", 300);
        Airplane.printCNT();
    }
}
