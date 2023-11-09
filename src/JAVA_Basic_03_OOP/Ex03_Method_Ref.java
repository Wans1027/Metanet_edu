package JAVA_Basic_03_OOP;

import JAVA_Basic_03_OOP.kr.or.kosa.Mouse;
import JAVA_Basic_03_OOP.kr.or.kosa.NoteBook;

public class Ex03_Method_Ref {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook("red", 2023);
        Mouse mouse = new Mouse(100, 200);
        noteBook.handleMouse(mouse);
    }
}
