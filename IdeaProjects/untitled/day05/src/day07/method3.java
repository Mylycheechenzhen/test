package day07;

import java.util.ArrayList;
import java.util.Random;

public class method3 {
    public static void main(String[] args) {
        ArrayList<Integer> name=new ArrayList<>();
        Random n=new Random();
        for (int i = 6; i > 0; i--) {
            int num=n.nextInt(33)+1;
            name.add(num);
        }
        System.out.print("{");
        for (int j = 0; j < 6; j++) {
            System.out.print(name.get(j));
            if(j==5)
                System.out.print("}");

            else System.out.print("@");
        }
    }
}
