package JAVA_Basic_04_Array.kr.or.kosa;

import java.util.List;

public class Lotto {
    int[] lotto = new int[6];

    public void runLotto(){
        //난수 ...
        //6개의 방 채우기
        for(int i = 0 ; i < 6 ; i++) {
            lotto[i] = (int)(Math.random()*45 + 1);
            for(int j = 0 ; j < i ; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        for(int i = 0 ; i < lotto.length ; i++) {
            for(int j = i+1 ; j < lotto.length ; j++) {
                if(lotto[i] > lotto[j]) {
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

        for(int i = 0 ; i < lotto.length ; i++) {
            System.out.print(lotto[i] + "\t");
        }
    }

}
