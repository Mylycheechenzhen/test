package day06;

public class student {
    private String name;
    private int age;

    public void setAge(int x){
        if(x<=200&&x>=0){
age=x;
        }else System.out.println("数据不合理");
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("年龄是"+age);
    }
}
