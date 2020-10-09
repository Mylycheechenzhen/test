package day10;
import java.util.Scanner;
public class text1 implements newInterface{
    @Override
    public void student(){
        System.out.println("%int tome get& $10.256");

    }
    private String name;
    private int age;

    public text1() {
    }

    public text1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}