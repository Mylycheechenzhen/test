package day09;

import java.util.ArrayList;
import java.util.Random;

public class member extends user {
    public member() {
    }
    public member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> me){//收钱集合
     int my =  new Random().nextInt(me.size());//随机抽取一个红包给自己
    super.setMoney(super.getMoney() + me.remove(my));


    }
}
