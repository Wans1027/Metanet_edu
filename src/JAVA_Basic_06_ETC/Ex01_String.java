package JAVA_Basic_06_ETC;

public class Ex01_String {
    public static void main(String[] args) {
        String str = "AAA";
        String str2 = "AAA";

        System.out.println(str);
        System.out.println(str2.toString());
        System.out.println(str == str2); //같은 문자는 같은 힙 주소를 공유한다. true

        String str3 = new String("BBB");
        String str4 = new String("BBB");
        System.out.println(str3);
        System.out.println(str4.toString());
        System.out.println(str3 == str4); //false;

        String s = "A";
        s+="B";
        s+="C";
        s="A";
    }
}
