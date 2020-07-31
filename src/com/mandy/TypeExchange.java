package com.mandy;

public class TypeExchange {
    public static void main(String[] args){
        //char类型和int类型之间的转换
        char c=(char)65536; //char的数据范围是0到65535
        System.out.println("c="+c);
        int n=98;
        n=c; //隐式类型转换
        System.out.println("n="+n);
        c=(char)n;
        System.out.println("c="+c);

        //整型和浮点型的类型转换
        int x=100;
        long y=x;
        x=(int)y;
        float f=1000000000000L;
        System.out.println("长整型转为浮点型f="+f);
        float f1=12345678902345678L;
        System.out.println("f1="+f1);
        //长整型转为浮点型f=1.0E12
        //f1=1.23456784E16  数据丢失

    }
}
