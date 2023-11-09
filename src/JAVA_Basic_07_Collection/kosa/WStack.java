package JAVA_Basic_07_Collection.kosa;

public class WStack<T>{
    private T[] stackArr;// stack 저장소
    private int position; //배열의 위치정보

    public WStack(int maxsize) {
        this.stackArr = (T[]) new Object[maxsize];
        this.position = -1;
    }
    public void push(T o){
        position++;
        stackArr[position] = o;
        System.out.println("push");
    }
    public T pop(){
        T o = stackArr[position];
        position--;
        return o;
    }
    public boolean isEmpty(){
        return position == -1;
    }
    public boolean isFull(){
        return position == stackArr.length-1;
    }
}
