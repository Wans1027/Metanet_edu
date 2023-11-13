package JAVA_Basic_09_Thread;
//보조 스레드는 메인스레드와 생명주기를 같이 한다.

class AutoSaveThread extends  Thread{
    public void save() {
        System.out.println("작업 내용을 자동 저장 ...");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                break;
            }
            save();
        }

    }
}
public class Ex10_DaemonThread {
    public static void main(String[] args) {
        // 주 스레드는 메인 함수
        AutoSaveThread auto = new AutoSaveThread();
        auto.setDaemon(true); //main 함수 thread 보조
        auto.start();

        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("메인 스레드 종료");
    }
}
