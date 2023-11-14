package CodingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1114_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int lineMax = 0;
        List<String> lineList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            lineList.add(s);
            lineMax = Math.max(s.length(), lineMax);
        }
        for (int i = 0; i < lineMax; i++) {
            for (int j = 0; j < 5; j++) {
                try{
                    char c = lineList.get(j).charAt(i);
                    sb.append(c);
                }catch (Exception e){
                    continue;
                }
            }
        }
        System.out.println(sb);
    }
}
