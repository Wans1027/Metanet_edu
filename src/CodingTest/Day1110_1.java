package CodingTest;

import java.util.Scanner;

public class Day1110_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][3];
        arr[0][0] = sc.nextInt();
        arr[0][1] = sc.nextInt();
        arr[0][2] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] arr2 = {a, b, c};
            for (int j = 0; j < 3; j++) {
                int idx1 = (j+1)%3;
                int idx2 = (j+2)%3;
                arr[i][j] = Math.max(arr[i - 1][idx1], arr[i - 1][idx2]) + arr2[j];
            }
        }
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result = Math.max(arr[n-1][i], result);
        }
        System.out.println(result);
    }
}
