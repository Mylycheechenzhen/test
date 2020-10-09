package day06;

public class method{
private int num;
public void show(){
    System.out.println("时间是"+num+"点");
}

public void setNum(int x){
    if(x>=0&&x<=23){
    num=x;}
    else
        System.out.println("时间不合理");
}
public int getNum(){
    return num;
}
}