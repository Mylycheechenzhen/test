package day10;
/*
1.实现类必须完全覆盖接口中的所有抽象类
2.如果不能完全覆盖，那么这个实现类本身就必须是抽象类

 */
public class animal  implements oneInterface{
    @Override

    public void dog() {
        System.out.println("哈士奇");
    }
@Override
    public  void cat(){
        System.out.println("折耳");
}
@Override
    public void liuyan(){
        System.out.println("渣男");
}

}

