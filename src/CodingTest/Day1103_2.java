package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Day1103_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int[] s = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = s[0];
            int b = s[1];
            if(a == b) System.out.println();
            else if(a>b){
                if(a%b == 0) System.out.println("multiple");
                else System.out.println("neither");
            }
            else {
                if(b%a == 0) System.out.println("factor");
                else System.out.println("neither");
            }
        }

    }
}
