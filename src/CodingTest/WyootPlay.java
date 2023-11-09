package CodingTest;

import java.util.Scanner;

public class WyootPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String[] s = sc.nextLine().split(" ");
            int cnt = 0;
            for (int j = 0; j < 4; j++) {
                if(s[j].equals("0")) cnt++;
            }
            int a = 64;
            a += cnt;
            if(cnt == 0) a = 'E';
            sb.append(Character.toChars(a));
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
