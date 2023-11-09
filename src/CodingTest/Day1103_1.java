package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Day1103_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        double[] answer = new double[n];
        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            for (int j = 1; j < arr.length; j++) {
                sum += arr[j];
            }
            double avg = (double) sum /(arr.length-1);
            int cnt = 0;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] > avg) cnt++;
            }
            double result = (double) cnt / (arr.length - 1);
            sb.append(String.format("%.3f", result*100));
            sb.append("\n");

        }
        System.out.println(sb);

    }
}
