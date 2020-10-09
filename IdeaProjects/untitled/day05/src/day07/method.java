package day07;
import java.util.Random;
import java.util.Scanner;
public class method {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        Random y=new Random();
        int luck=y.nextInt(100)+1;
        while (true){
            System.out.println("请做出你的猜测：");
            int x=num.nextInt();
            if(x>luck)
                System.out.println("猜大了！");
            else if (x<luck)
                System.out.println("猜小了！");
            else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }

    }
}
