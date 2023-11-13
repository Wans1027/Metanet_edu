package JAVA_Basic_09_Thread;
/*
멀티 스레드 환경 ( 공유자원 ..)
synchronized (동기화)

Collection ( Vector 동기화, ArrayList 비동기화) 비교

Vector > 동기화 보장 > 멀티 스레드 환경 > 자원보호 > 화장실(lock) > 성능저하 ....
ArrayList 동기화 보다는 성능 보장 > 성능

한강 화장실: 공유자원
화장실을 사용하려는 사용자 (스레드) : 한명이 들어가면 문을 잠궈버림 LOCK>> 나올때 까지 기다려야됨

한강 비빔밥 축제:
LOCK 없이 동시에 달려듬
 */
class Wroom{
    //void openDoor(String name) {//동기화 (X)
    synchronized void openDoor(String name) {//동기화
        System.out.println(name + "님 화장실 입장 ^ ^");
        for (int i = 0; i < 100; i++) {
            System.out.println(name + " 사용중" + i);
            if (i == 10) {
                System.out.println(name +"님 끙ㅇ");
            }
        }
        System.out.println("시원하시죠 ^^ !");
    }
}

class User extends Thread {
    Wroom wr;
    String who;

    User(String name, Wroom wr) {
        this.who = name;
        this.wr = wr;
    }

    @Override
    public void run() {
        wr.openDoor(this.who);
    }
}

public class Ex08_Sync_Thread {
    public static void main(String[] args) {
        //한강 둔치
        Wroom w = new Wroom();
        //사람들
        User kim = new User("김씨", w);
        User lee = new User("김씨", w);
        User park = new User("김씨", w);

        //배가 아파요
        kim.start();
        lee.start();
        park.start();
    }
}
