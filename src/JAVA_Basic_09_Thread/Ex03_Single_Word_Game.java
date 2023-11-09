package JAVA_Basic_09_Thread;

import javax.swing.*;

/*
단어 맞추기
구구단 게임

문제가 나오고 ... 시간이 주어지고
일정 시간이 지나면 종료

 */
public class Ex03_Single_Word_Game {
    public static void main(String[] args) {
        String inputData = JOptionPane.showInputDialog("값을 입력하세요");
        System.out.println("입력값: " + inputData);

    }
    private static void timer() {
        for (int i = 0; i > 0; i--) {
            try {
                System.out.println("남은시간:"+i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
