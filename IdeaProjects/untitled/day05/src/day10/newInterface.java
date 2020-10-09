package day10;

public interface newInterface  {
    public  abstract void student();
    public default void jasong(){
        System.out.println("接口继承");
    }
    public static void center(){
        System.out.println("静态升级");
    }
}
