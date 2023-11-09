package JAVA_Basic_03_OOP;
/*
설계도를 만들때
static member field : 객체간 공유자원
static method : public static void run() ....

static method 사용이유
1. 많이 사용하는 기능이니 굳이 new를 사용하지 않음
2. 많이 사용할 것 같은 기능들
3. static 영역은 가비지 컬렉터가 작동하지 않으니 남발하지 않기로
 */

class StaticClass{
    int iv ;
    static int cv;
    static void print(){
        //static 함수는 static 자원만 사용가능하다.
        //iv = 10;//Non-static field 'iv' cannot be referenced from a static context
    }
    void printIv(){
        //일반함수
        //일반자원 + static 자원 모두 사용가능
    }
}
public class Ex07_Static_method {
}
