package JAVA_Basic_09_Thread;

import javax.swing.*;

/*
2개의 함수가 동시에 실행이 안되요
Stack 이 여러개 >> multi thread
문제
시간
2개 동시에 (경합) >> CPU 안에서
 */
class WordTime extends Thread{
    @Override
    public void run() {
        for (int i = 0; i > 0; i--) {
            if(Ex04_Multi_Word_Game.check) return;
            try {
                System.out.println("남은시간:"+i);
                Thread.sleep(1000); //휴게실에서 1초 쉬었다가 경합 (점유) >> runnable
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class WordInputThread extends Thread {
    @Override
    public void run() {
        String inputData = JOptionPane.showInputDialog("값을 입력하세요");
        if (inputData != null && !inputData.equals("")) {
            Ex04_Multi_Word_Game.check = true; //한개의 단어라도 입력되면 시간 멈춤
        }
        System.out.println("입력값: " + inputData);
    }
}
public class Ex04_Multi_Word_Game {
    static boolean check = false;

    public static void main(String[] args) {

        WordTime wordTime = new WordTime();
        wordTime.start();

        WordInputThread wordInputThread = new WordInputThread();
        wordInputThread.start();

        System.out.println("main End");
    }
}
