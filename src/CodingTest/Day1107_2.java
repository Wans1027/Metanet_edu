package CodingTest;

import java.util.Scanner;
import java.util.Stack;

public class Day1107_2 {
    private static Stack<Integer> st = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            sta(sc);
        }
        System.out.println(sb);
    }

    private static void sta(Scanner sc){
        int n = sc.nextInt();
        //sc.nextLine();
        switch (n) {
            case 1:
                st.push(sc.nextInt()); break;
            case 2:
                if(st.empty()) sb.append(1+"\n");
                else sb.append(st.pop()+"\n"); break;
            case 3:
                sb.append(st.size()+"\n"); break;
            case 4:
                int a = st.empty() ? 1 : 0;
                sb.append(a+"\n"); break;
            case 5:
                if(st.empty()) sb.append(-1+"\n");
                else sb.append(st.peek()+"\n"); break;
        }
    }
}
