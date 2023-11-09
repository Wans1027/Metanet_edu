package Work;

import java.util.Scanner;

public class FlowToProgram {
    public static void main(String[] args) {
        int unit = 10000;
        int num = 0;
        int sw = 0;

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        while(true){
            num = (int) (money / unit);
            System.out.println(unit+" " + num +"개");

            if(unit > 1){
                money = money - unit * num;
            }else break;

            if(sw == 0) {
                unit /= 2;
                sw = 1;
            }
            else if(sw == 1){
                unit /= 5;
                sw = 0;
            }
        }


    }
}
