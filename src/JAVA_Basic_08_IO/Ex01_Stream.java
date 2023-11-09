package JAVA_Basic_08_IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex01_Stream {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //byte // -128 ~ 127
        byte[] outSrc = null;

        //중간매개체(stream) > memory > read, write
        //입력
        ByteArrayInputStream input = null; //빨대 (통로) 입력 전용
        ByteArrayOutputStream output = null;// 출력 전용

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        System.out.println("outSrc before:" + Arrays.toString(outSrc)); //null

        //공식같은 로직(암기)
        int data = 0;
        while ((data = input.read()) != -1) {
            //System.out.println(data);

            //read 한 데이터를 출력(다른 stream)
            output.write(data);
        }

        /*while ((input.read()) != -1) { //이거 안됨
            System.out.println(input.read());//1 3 5 7 9
        }*/

        outSrc = output.toByteArray(); //heap 생성된 배열 객체의 주소값을 return //뱉어내기
        System.out.println("outSrc after :" + Arrays.toString(outSrc));

    }
}
