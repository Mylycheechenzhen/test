package day06;

public class method2 {
    public static void main(String[] args) {
        int[] function=new int[]{5,6,8,9,20};
        int a=max(function);
        System.out.println("zuidazhi"+a);
    }
    public static int max(int[] f){
        int a=0;
        for (int i=0;i<=f.length-1;i++)//注意长度
        {
            if (f[i]>=a)
        a=f[i];
        }
        return a;
        }
    }
