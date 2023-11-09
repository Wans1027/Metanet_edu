package JAVA_Basic_04_Array;

public class Ex03_Array_Rank {
    public static void main(String[] args) {
        int[][] score = new int[3][2];// 3행 2열
        score[0][0] = 100;

        //다차원 배열 >> 중첩 for문
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println((score[i][j]));
            }
        }
        int[][] score2 = new int[][]{{11, 12}, {13, 14}, {15, 16}};
        for (int[] arr : score2) {
            for (int value : arr) {

            }
        }
    }
}
