package com.mandy;

public class CharDemo {
    public static void main(String[] args){
        //定义一个变量存放字符'a'
        char a='a';
        System.out.println("a="+a);
        char b='b';
        System.out.println("b="+b);
        char ch=65;
        System.out.println("ch="+ch);
        //a=a
        //b=b
        //ch=A why? 65对应ASCII码里面的A

        char ch1=65535;
        System.out.println("ch1="+ch1);
        //如果字面值超出char类型所表示的数据范围，需要进行强制类型转换
        char ch2=(char)65536;
        System.out.println("ch1="+ch2);
        //ch1=￿
        //ch1=

        //定义变量存放unicode编码表示的字符
        char c='\u005d';
        System.out.println("c="+c);
        //c=]

        //定义一个整型变量n,值为98
        int n=98;
        //定义一个char类型的变量ch3, 将变量n赋值给ch,然后输出ch的值
        char ch3=(char)n; // int 转化为字符型char, 想要进行强制转换加(char)
        System.out.println("ch="+ch);
    }
}
