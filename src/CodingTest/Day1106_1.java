package CodingTest;

import java.util.Scanner;

public class Day1106_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i < arr.length+1; i++) {
            arr[i-1] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
