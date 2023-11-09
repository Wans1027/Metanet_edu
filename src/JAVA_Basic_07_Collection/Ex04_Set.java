package JAVA_Basic_07_Collection;

import java.util.HashSet;
import java.util.Set;

/*
Set 인터페이스
(원안에 들어가세요) : 순서를 보장 x, 중복을 허락하지 않음
순서가 없고 중복을 허락하지 않는 데이터 집합
구현하는 클래스
Hashset, TreeSet (자료구조)
 */
//로또, 차량번호, 회원ID,
public class Ex04_Set {
    public static void main(String[] args) {
        Set set2 = new HashSet();
        //로또번호
        while (set2.size() < 6) {
            int num = ((int) Math.random() * 45) + 1;
            set2.add(num);
        }
    }
}
