package CodingTest;

import java.util.Scanner;

public class Day1108_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(factorial(input));
    }

    private static int factorial(int x) {
        return (x == 0) ? 1 : x * factorial(x - 1);
    }
}
