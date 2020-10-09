package day08;
                                        /*字符串的比较*/
public class method {
    public static void main(String[] args) {
        String str1=new String();
        str1="apple";
        char[] p={'a','p','p','l','e'};
        String str2=new String(p);
        System.out.println(str1==str2);//直接使用==是在用地址值进行比较
        System.out.println(str1.equals(str2));//使用equals函数则是直接进行数值比较，严格区分大小写
        System.out.println("apple".equals(str1));
        System.out.println("====================================");
        String str3="Java";
        String str4="java";
        System.out.println(str3.equalsIgnoreCase(str4));//忽略大小写，直接进行比较
        System.out.println("====================================");
        //计算字符串的长度
        int x=str1.length();
        System.out.println(x);
        System.out.println("====================================");
        //拼接两个字符串
        String str5=str3.concat(str4);
        System.out.println(str5);
        System.out.println("=======================================");
        //从一个字符串中提取单个字符
        char y="可惜没如果".charAt(3);//数值从零开始计算，第一位坐标为0
        System.out.println(y);
        System.out.println("====================================");
        //查找字符第一次出现的位置，如果没有，输出-1
        String a="你就不要想起我";
        int b=a.indexOf("我");
        System.out.println(b);
        System.out.println("====================================");
        //截取字符串
        String q="everything";
        String w=q.substring(5);//截取某坐标之后的
        String e=q.substring(1,4);//截取两坐标之间的
        System.out.println(w);
        System.out.println(e);
        System.out.println("====================================");
        //将字符串替换为char,byte类型
        char[] charr="loveyou".toCharArray();//char
        System.out.println(charr[6]);
        byte[] byt="love".getBytes();//byte
        for (int i = 0; i < 4; i++) {
            System.out.println(byt[i]);
        }
        System.out.println("====================================");
        //字符替换
        String new1="卧槽!you";
        String new2=new1.replace("卧槽","**");
        System.out.println(new2);
        //字符串切割
        String t="wdnmdwdnmd";
        String[] split=t.split("n");//将字符串用n风格开，当以英文句号.为分割时，必须为//.



    }

}
