package CodingTest;

import java.util.Scanner;

public class Day1106_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int c = sc.nextInt();
            for (int j = a; j <= b; j++) {
                arr[j] = c;
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
