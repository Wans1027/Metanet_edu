package CodingTest;

import java.util.Scanner;

public class Day1113_2 {
    static int[][] dp = new int[30][30];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {

            // M개중 N개를 뽑는 경우이므로 nCr 에서 n = M, r = N이다.
            int N = sc.nextInt();	// N = r
            int M = sc.nextInt();	// M = n

            sb.append(combi(M, N)).append('\n');
        }

        System.out.println(sb);

    }

    static int combi(int n, int r) {

        if(dp[n][r] > 0) {
            return dp[n][r];
        }
        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }
        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
}