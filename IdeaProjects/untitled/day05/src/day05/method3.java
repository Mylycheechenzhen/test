package day05;

public class method3 {
    public static void main(String[] args) {
        System.out.println(load(5,6));
    }
//Overload重载，与方法的返回值类型无关
    public static boolean load(byte a,byte b){
        return a==b;
    }
    public static boolean load(int a,int b){
       boolean mean;
       if(a==b)
           mean=true;
       else mean=false;
       return mean;
    }
    public static boolean load(long a,long b){
        return a==b?true:false;
    }
}
