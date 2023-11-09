package JAVA_Basic_09_Thread;


class Task_1 extends Thread{
    @Override
    public void run() { //run 함수는 Thread main 함수 역할 >> 새로운 스택 처럼 올라가서 실행되는 함수

        for (int i = 0; i < 1000; i++) {
            System.out.println("Task_1" + i + this.getName());
        }
        System.out.println("Task_1 run() END");
    }
}
class Task_2 implements  Runnable{ //Thread 아님 (run()을 가지고 있는 클래스 일 뿐
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Task_2" + i);
        }
        System.out.println("Task_2 run() END");
    }
}

public class Ex02_Multi_Thread {
    public static void main(String[] args) {

        Task_1 th = new Task_1(); //스레드 객체 생성
        th.start(); //스택을 하나 생성해주고 생성된 스택에 run()함수 올려주고 소멸****!!!!
        Thread th2 = new Thread(new Task_2());
        th2.start();

        //메인 스택
        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
        }
        System.out.println("main END");

        //익명 객체 (일회성)
        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        th3.start();
    }
}
