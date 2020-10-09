package day06;
import java.util.Scanner;
public class iphone {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Scanner me=new Scanner(System.in);
        age=me.nextInt();

        this.age =age;
    }
    public void show(){
        System.out.println("年龄为"+age);
    }

    public iphone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public iphone() {
    }
}
