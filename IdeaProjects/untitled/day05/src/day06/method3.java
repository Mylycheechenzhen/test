package day06;

public class method3 {
    public static void main(String[] args) {
        method time=new method();
        time.show();
        time.setNum(-20);
        time.show();
        student age=new student();
        age.show();
        age.setAge(25);
        age.show();
        age.setAge(-10);
        age.show();
        System.out.println("====================");
        iphone me=new iphone();
        me.setName("chen");
        System.out.println("==="+me.getName());
        me.show();
    }
}
