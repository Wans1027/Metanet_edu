package JAVA_Basic_03_OOP.kr.or.kosa;
/*
노트북은 색상을 가지고 있다
노트북은 생산년도를 가지고 있다
노트북은 마우스를 가지고 있다
>> 마우스를 필요에 따라 사용할 수도 있다
마우스는 좌표값을 가지고 있다. 나중에 추가 >> 휠 1개, 버튼 ㅈ개,
 */
public class NoteBook {
    private String color;
    private int productYear;


    public NoteBook(String color, int productYear) {
        this.color = color;
        this.productYear = productYear;
    }

    public void test(){

    }
    public void handleMouse(Mouse mouse) { //의존 관계!! 노트북에 마우스가 없어도 함수의 파라미터로 받을 수 있음
        mouse.setX(100);
        mouse.setY(200);
        mouse.getReadMouseData();
    }



    /*public NoteBook(String color, int productYear, Mouse mouse) {
        this.color = color;
        this.productYear = productYear;
        this.mouse = mouse;
    }*/ // 노트북과 마우스의 lifeCycle이 같아 버리는 문제 발생




    /*
    사용하려면
    main{
     Notebook note = new Notebook("red", 2000);
     Mouse m = new Mouse();
     note.handleMouse(m);

    }
     */
}


