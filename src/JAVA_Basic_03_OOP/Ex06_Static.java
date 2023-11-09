package JAVA_Basic_03_OOP;

class Test2{
    static int cv = 10;
    static int cv2; // default 0
    int iv = 9;

    //초기화 블럭
    //{   } 일반자원 초기화 블럭
    //static {   } static 자원 초기화 블럭
    static {
        System.out.println("static 초기화 블럭 실행");
        //static 자원이 메모리에 올라간 직후 호출 (자동)
        cv = 1111;
        cv2 = cv + 2222; // 조작된 표현이 가능
    }

    {
        //일반 초기화 .. 블럭 >> 생성자를 쓰는게 더 좋음..
        if(iv < 10) iv = 1000;
        System.out.println("초기화 블럭 실행");
    }
}
public class Ex06_Static {
}
