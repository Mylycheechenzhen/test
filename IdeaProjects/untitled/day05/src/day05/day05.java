package day05;

public class day05 {
    public static void main(String[] args) {
        Mether();
        sum(5, 6);
        System.out.println(sum(9, 8));
        int sumer=sum(6,3);
        sumer +=100;
        System.out.println(sumer);
    }

    public static int sum(int a, int b) {
        int bean = a * b;
        System.out.println("============");
        return bean;
    }

    public static void Mether() {
        for (int i = 5; i > 0; i--) {
            for (int i1 = 5; i1 > 0; i1--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

