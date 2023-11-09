package JAVA_Basic_07_Collection.bookManage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookManager {
    //BookManager (도서 추가 , 도서 삭제 , 도서 검색 , 도서목록 )
    Scanner sc = new Scanner(System.in);
    private Map<String, Book> bookMap;

    public BookManager() {
        bookMap = new HashMap<>();
    }

    public void run(){
        while(true){
            System.out.println();
            System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    addBook();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    bookList();
                    break;
                case 5:
                    isbnList();
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    return;
            }
        }


    }

    private void addBook() {
        /*
        추가할 도서 ISBN:1234
        도서 제목:Java
        가격:2000
        ISBN:1234 이름:Java 가격:2000 생성하였습니다.
         */
        System.out.print("추가할 도서 ISBN:");
        String isbn = sc.nextLine();
        sc.nextLine();
        System.out.print("도서 제목:");
        String bookName = sc.nextLine();
        System.out.print("가격:");
        int price = sc.nextInt();

        bookMap.put(isbn, new Book(isbn, bookName, price));
        System.out.printf("ISBN:%s 이름:%s 가격:%d", isbn, bookName, price);
    }

    private void deleteBook() {
        /*
        삭제할 도서 ISBN:4321
        삭제하였습니다.
         */
        System.out.print("삭제할 도서:");
        String isbn = sc.nextLine();
        bookMap.remove(isbn);
        if(bookMap.containsKey(isbn)) System.out.println("삭제되었습니다");
        else System.out.println("삭제되지 않았습니다.");
    }

    private void searchBook(){
        /*
        검색할 도서 ISBN:1234
        검색 결과>>ISBN:1234 이름:Java 가격:2000
         */
        System.out.print("검색할 도서 ISBN:");
        String isbn = sc.nextLine();
        Book book = bookMap.get(isbn);
        System.out.printf("검색결과>> ISBN:%s 이름:%s 가격:%d",book.isbn,book.title, book.price);
    }

    private void bookList(){
        /*
        도서 목록
        도서 수:2
        ISBN:1234 이름:Java 가격:2000
        ISBN:3421 이름:자료구조 가격:2000
         */
        System.out.println("도서 목록");
        System.out.println("도서 수" + bookMap.size());
        for (Book book : bookMap.values()) {
            System.out.println(book.toString());
        }
    }

    private void isbnList(){
        /*
        ISBN 목록
        도서 수:2
        1234
        3421
         */
        System.out.println("도서 목록");
        System.out.println("도서 수: " + bookMap.size());
        Set<String> st = bookMap.keySet();
        for (Book book : bookMap.values()) {
            System.out.println(book.isbn);
        }
    }
}
