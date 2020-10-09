package day09;

public class user {
    private String name;//成员姓名
    private int money;//总钱数

    public user() {
    }

    public user(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void show(){
        System.out.println("姓名："+name+"余额："+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
