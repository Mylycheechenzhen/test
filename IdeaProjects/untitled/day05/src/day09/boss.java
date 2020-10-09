package day09;
/*1.先遍历自己的名字和预留金额（注意留出空对象）
  2.将金额分组分包，放入集合
 */
import java.util.ArrayList;
public class boss extends user{
    public boss(){
    }
    public boss(String name,int money){
        super(name,money);
    }
    public ArrayList<Integer> send(int total,int count){//发红包
        ArrayList<Integer> a = new ArrayList<>();
        if (total>=super.getMoney()) {
            System.out.println("余额不足！");
        return a;
        }
        int leftMoney=super.getMoney();
        super.setMoney(leftMoney-total);
        int one = total/count;//一份的金额
        int remainder = total%count;
        for (int i = 0; i < count; i++) {
            if(i!=count-1)
            a.add(one);//将每一份金额输入数组
            else a.add(one+remainder);
        }
        return a;
    }
}
