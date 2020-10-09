package day10;
//接口升级：如果要新添加方法体，又使其它继承方法不报错，可以直接添加defaul实现类
//直接在接口添加（仍然可以被覆盖重写，单独使用）
//定义接口的静态方法直接改为static即可，也需要定义方法体
public interface oneInterface {
    public abstract void dog();
     void cat();//插口中定义抽象类可以省略p a
     void liuyan();
    public default void sun() {
        System.out.println("新靖人选");
    }
    public static void twoInterface(){
        System.out.println("静态接口");
    }
}
