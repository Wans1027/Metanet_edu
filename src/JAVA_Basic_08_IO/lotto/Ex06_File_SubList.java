package JAVA_Basic_08_IO.lotto;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex06_File_SubList {
    static int totalFiles = 0;
    static int totalDir = 0;

    static void printFilList(File dir) {
        //getAbsolutePath() 절대경로 알려줌
        System.out.println("Full Path : " + dir.getAbsolutePath());
        List<Integer> subdir = new ArrayList<>();

        File[] files = dir.listFiles(); //하위 폴더와 파일 포함
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName(); //폴더명 or 파일명

            if (files[i].isDirectory()) {
                fileName = " [DIR]" + fileName;
                subdir.add(i);
            }else {
                fileName = fileName + " / " + files[i].length() + "byte";
            }
        }

        //폴더의 개수와 파일 개수를 알고 싶다...
        int dirNum = subdir.size(); //현재 주어진 C:\Temp 하위에 있는 폴더 개수
        int fileNum = files.length -dirNum; // 하위에 있는 파일 개수

        //누적개수
        totalDir += dirNum;
        totalFiles += fileNum;

        System.out.println("[Current Dirnum] :" + dirNum);
        System.out.println("[Current Filenum] :" + fileNum);
        /*
        //폴더의 하위 폴더까지 보고 싶다..
        [0] > a.txt
        [1] > aaa폴더 > a-1폴더 > a-2폴더
        [2] > bbb폴더 > b-1폴더 , b.txt
         */
        System.out.println("************************");
        for (int i = 0; i < subdir.size(); i++) {
            int index = subdir.get(i);
            printFilList(files[index]); //재귀처럼
        }
    }
    public static void main(String[] args) {
        File f = new File("C:\\Temp");
        if (!f.exists() || !f.isDirectory()) {
            System.out.println("유효한 디렉토리가 아닙니다");
            System.exit(0);
        }
        //정상적인 경로이고 폴더구나
        printFilList(f);
        System.out.println("누적 총 파일수 :" + totalFiles);
        System.out.println("누적 총 폴더수 :" + totalDir);
    }
}
