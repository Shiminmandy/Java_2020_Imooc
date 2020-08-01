package com.operator;

public class MathDemo1 {
    public static void main(String[] args){
        //自加减运算 x++
        int x=4;
        int y=(x++)+5;
        System.out.println("x="+x+",y="+y);//x=5,y=9  ++在后面则先进行运算，后进行自加减
        //++x的形式
        x=4;
        y=(++x)+5;
        System.out.println("x="+x+",y="+y);//x=5,y=10 ++在前面则先进行自加减运算
        //x--的形式
        x=4;
        y=(x--)+5;
        System.out.println("x="+x+",y="+y);//x=3,y=9 先运算后自减
        //--x的形式
        x=4;
        y=(--x)+5;
        System.out.println("x="+x+",y="+y);//x=3,y=8 先自减后运算


    }
}
