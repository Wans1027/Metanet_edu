package JAVA_Basic_08_IO;

import java.io.*;

public class Ex07_PrintWriter {
    public static void main(String[] args) {
        try {
            //출력 양식 정의 (format) //메모장에 입력한대로 써짐
            /*PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt");
            pw.println("*****************************");
            pw.println("***********HOMEWORK************");
            pw.printf("%3s : %5d, %5d, %5d, %5.1f", "아무개", 100, 88, 90, (float) ((100 + 88) / 3));
            pw.println();
            pw.close();*/

            FileReader fr = new FileReader("C:\\Temp\\homework.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
