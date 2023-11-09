package JAVA_Basic_08_IO;

import java.io.File;

public class Ex05_File_Dir {
    public static void main(String[] args) {
        File f = new File("C:\\Temp");
        //다양한 정보 얻기 위해서
        if(!f.exists() || !f.isDirectory()){
            //존재하지 않거나 디렉토리가 아니면
            System.out.println("유효하지 않은 경로");
            System.exit(0);//프로세스의 강제 종료
        }

        //실제 존재하는 경로이고 폴더라면
        //POINT

        //[1.jpg][2.txt][file.txt][기러기][aaaa] >> 배열의 타입은 File >> File[] list = new
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++) {
            String name = files[i].getName(); //파일명 ,,, 폴더명
            System.out.println(files[i].isDirectory() ? "[DIR]" + name : name);
        }
    }
}
