package day07;

import java.util.ArrayList;

public class method2 {
    public static void main(String[] args) {
        ArrayList<person> t=new ArrayList<>();
        person one=new person("刘阳",18);
        person two=new person("孙庆帅",19);
        person three=new person("盖得龙",19);
       t.add(one);
       t.add(two);
       t.add(three);
        for (int i = 0; i < t.size(); i++) {
            person x=t.get(i);
            System.out.println("姓名:"+x.getName()+",年龄："+x.getAge());
        }
    }
}
