package JAVA_Basic_08_IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
컴퓨터에서 가장 느린 작업: Disk read/write
File 처리 > DISK > 입출력단위가 한 byte

버스(Buffe) 한번에 여러명을 태워서 가자 ...
1. I/O 성능 개선 (접근 횟수)
2. 라인 단위의 처리가 가능(엔터 기반)

BufferedOutPutStream (보조 스트림) >> 독자적인 작업 불가 >> helper > File stream 도와서
 */
public class Ex03_Stream_Buffer {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            fos = new FileOutputStream("data.txt"); //default 경로.. src
            bos = new BufferedOutputStream(fos);//버퍼 생성
            for (int i = 0; i < 10; i++) {
                bos.write('A');
            }
            //bos.flush();
        } catch (Exception e) {

        }finally {
            try {
                fos.close();
                bos.close(); //flush()를 내장
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
