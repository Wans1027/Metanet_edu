package JAVA_Basic_07_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student{
    int kor;
    int math;
    int eng;
    String name;

    public Student(int kor, int math, int eng, String name) {
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.name = name;
    }
}
public class Ex04_Map {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("Tiger", "1004"); // id, pwd
        map.put("scott", "1004");
        System.out.println(map.containsKey("Tiger"));
        System.out.println(map.get("Tiger"));

        Set set = map.keySet();
        //key 집합은 중복값이 없고 순서를 보장하지 않음
        //표준화된 출력(iterator)
        Iterator it = set.iterator();

        //HashMap<String, String>
        HashMap<String, Student> smap = new HashMap<>();
        smap.put("홍", new Student(100, 100, 20, "홍길동"));
        smap.put("hong", new Student(100, 100, 20, "ghodnndlkn"));

        Student stu = smap.get("hong");

    }
}
