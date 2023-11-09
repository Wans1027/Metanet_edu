package JAVA_Basic_06_ETC;

import java.util.Scanner;

public class Ex02_String_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check1;
        boolean check2;
        String str = "";
        do {
            str = sc.nextLine();
            String[] strArray = str.split("-");
            System.out.println("앞:" + strArray[0] + "뒤:" + strArray[2]);
            check1 = checkLength(str);
            check2 = checkFirstNum(strArray[2]);
        }while (!check1 && !check2);

        System.out.println(checkMaleOrFemale(str));

    }

    private static boolean checkLength(String str){
        return str.length() == 14;
    }

    private static boolean checkFirstNum(String secondStr){
        char[] c = {'1','2','3','4'};
        for (char c1 : c) {
            if(secondStr.charAt(0) == c1) return true;
        }
        return false;
    }

    private static String checkMaleOrFemale(String secondStr){
        char[] male = {'1', '3'};
        for (char c : male) {
            if(secondStr.charAt(0) == c) return "남자";
        }
        return "여자";
    }
}
