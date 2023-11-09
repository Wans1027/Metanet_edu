package JAVA_Basic_07_Collection;

import java.util.Properties;

public class Ex05_Properties {
    public static void main(String[] args) {
        Properties prop = new Properties(); //전역적인 Map<String, String>
        prop.setProperty("admin", "kosa@kosa.or.kr");
        prop.setProperty("downpath", "C:\\Temp\\images");
        System.out.println(prop.getProperty("admin"));
    }
}
