package JAVA_Basic_08_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Point

Byte 데이터를 read/ write 대상이 >>File (a.txt)
FileInputStream
FileOutputStream

자료실(이미지, 엑셀) read, write

File >>>

I/O 자원은 개발자가 직접적으로 자원 해제 (워드 파일 작업중... 열려 있으면 다른 파일 read, wirte .. 기존 닫기)
close() 자원해제
I/O 예외처리가 강제되어 있다

 */
public class Ex02_FileStream {
    public static void main(String[] args) {
        FileInputStream fs = null;
        FileOutputStream fos = null;

        String path = "C:\\Temp\\a.txt";

        try {
            fs = new FileInputStream(path);
            fos = new FileOutputStream("C:\\Temp\\new.txt", false);
            //현재 new txt 파일은 없다.
            /*
            FileOutoutStream
            1. write파일 존재하지 않으면 >> File create
            2. fos = new FileOutputStream("C:\\Temp\\new.txt", false);
                falss >> Overwrite 덮어쓰기 , true >> append

             */
            int data = 0;
            while ((data = fs.read()) != -1) {
                fos.write(data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //정상, 비정상 종료
            //강제 실행
            //함수가 return 종료 되어도 발동 //강려크

            try {
                fs.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
