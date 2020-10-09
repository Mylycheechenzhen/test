package day09;

import java.util.ArrayList;

public class method {
    public static void main(String[] args) {
        boss chen=new boss("cz",1000000);
        member one=new member("ly",0);
        member two=new member("sqs",10);
        member three=new member("gdl",10);
        System.out.println("=========================");

        chen.show();
        one.show();
        two.show();
        three.show();

        System.out.println("=========================");
        ArrayList<Integer> pacage = chen.send(10000,3);
        one.receive(pacage);
        two.receive(pacage);
        three.receive(pacage);

        System.out.println("=========================");
        chen.show();
        one.show();
        two.show();
        three.show();
    }
}
