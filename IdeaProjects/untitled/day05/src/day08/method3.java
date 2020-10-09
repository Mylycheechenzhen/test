package day08;

import java.util.Scanner;

public class method3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String st=sc.nextLine();
        char[] ch=st.toCharArray();
        int a=0,b=0,c=0,d=0;
        for (int i = 0; i < ch.length; i++) {
        if(ch[i]>='a'&&ch[i]<='z')
            a++;
        else if(ch[i]>='A'&&ch[i]<='Z')
            b++;
        else if(ch[i]>='0'&&ch[i]<='9')
            c++;
        else d++;
        }
        System.out.println("小写字母"+a+"大写；"+b+"shu"+c+"    "+d);
    }
}
