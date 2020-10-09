package day07;

import java.util.ArrayList;
import java.util.Random;

public class method4 {
    public static void main(String[] args) {
        Random x=new Random();
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> ou=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            num.add(x.nextInt(100)+1);}
            ArrayList<Integer> small=big(num);
        for (int j = 0; j < small.size(); j++) {
            System.out.println(small.get(j));
        }
    }
    public static ArrayList<Integer> big(ArrayList<Integer> samll){
        ArrayList<Integer> b=new ArrayList<>();
         for (int i = 0; i <samll.size() ; i++) {
        if(samll.get(i)%2==0)
            b.add(samll.get(i));
        }
        return b;
    }
}
