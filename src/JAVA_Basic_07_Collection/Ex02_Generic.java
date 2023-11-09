package JAVA_Basic_07_Collection;
//설계도

import JAVA_Basic_07_Collection.kosa.WStack;

import java.util.Stack;

class MyGeneric<T> { //여기다가는 타입을 써라 Type Prameter
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get() {
        return this.obj;
    }
}

class Person{
    int age = 100;

}
public class Ex02_Generic {
    public static void main(String[] args) {
        MyGeneric<String> mygen = new MyGeneric<>();
        //MyGeneric T 가 String으로 바뀜
        //T obj -> String obj
        MyGeneric<Person> myPerson = new MyGeneric<>();
        //T obj -> Person obj

        Stack<Integer> st = new Stack<>();

    }
}
