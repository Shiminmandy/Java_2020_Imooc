package com.mandy;

public class FloatDemo {
    public static void main(String[] args){
        //定义一个单精度浮点型变量，存放1234.328
        //数值后面如果没有定义则默认为double
        float f =1234.328f;
        System.out.println("f="+f);
        //定义一个双精度浮点型变量，存放5623.465
        double d=5623.465;// 可加d也可不加d
        System.out.println("d="+d);
        //double 类型数据表示范围是最大的
        //将整型赋值给浮点型
        double d1=123;
        System.out.println("d1="+d1);
        //变量间的赋值
        double d2=d;
        System.out.println("d2="+d2);
        //将f的值赋给d2
        d2=f;//无需再定义d2的类型

        System.out.println("赋值后d2的值为:"+d2);
    }
}
//f=1234.328
//d=5623.465
//d1=123.0
//d2=5623.465
//赋值后d2的值为:1234.3280029296875