package JAVA_Basic_08_IO.lotto;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lotto0 {
    List<String> result;

    public Lotto0() {
        result = new ArrayList<>();
    }

    public void run(int runCycle){
        for (int i = 0; i < runCycle; i++) {
            Set<Integer> set = new TreeSet<>();
            while(set.size() != 6){
                int num = (int)(Math.random()*45 + 1);
                set.add(num);
            }
            LocalDate now = LocalDate.now();
            String st = set.toString() + now;
            result.add(st);
        }

    }

    public void write(int cycle){
        run(cycle);
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            fos = new FileOutputStream("data2.txt"); //default 경로.. src
            bos = new BufferedOutputStream(fos);//버퍼 생성
            for (String s : result) {
                bos.write((s+"\n").getBytes());
            }
            bos.flush();

        } catch (Exception e) {

        }finally {
            try {
                fos.close();
                bos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void read(){
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("data2.txt");
            br = new BufferedReader(fr);

            String line = "";
            for (int i = 0; (line = br.readLine())!= null; i++) {
                System.out.println(line);
            }
        } catch (Exception e) {

        }finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
