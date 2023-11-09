package JAVA_Basic_03_OOP.kr.or.kosa;

public class Airplane {
    private String name;
    private int num;
    private static int cnt;

    public Airplane(String name, int num) {
        this.name = name;
        this.num = num;
        printInfo();
        cnt++;
    }
    /*public void makePlane(String name, int num) {
        this.name = name;
        this.num = num;
        printInfo();
        cnt++;
    }*/



    private void printInfo(){
        System.out.println(name +" "+ num);
    }

    static public void printCNT(){
        System.out.println(cnt);
    }
}
