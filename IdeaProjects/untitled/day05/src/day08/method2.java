package day08;

public class method2 {
    public static void main(String[] args) {
        int[] num={1,2,3};
        System.out.println(arrawe(num));

    }
    public static String arrawe(int[] num){//直接将字符串作为类
        String str="[";
        for (int i = 0; i < num.length; i++) {
            if(i==num.length-1)
                str += "world"+num[i]+"]";//+=可直接将字符加入字符串
            else
            str += "world"+num[i]+"&";
        }
        return str;
    }
}
