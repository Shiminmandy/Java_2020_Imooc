package com.flow1;

public class StarDemo1 {
    public static void main(String[] args){
        int m=1;//外重循环的循环变量
        int n=1;//内重循环的循环变量
        System.out.println("输出4行4列的星号：");
        //外重循环控制输出几行
        while(m<=4){
            //内重循环控制每行输出几个星号
            n=1;//确保多次循环需要重新赋值n
            while(n<=4){
                System.out.print("*");//在同一行输出则为print而不是println
                n++;
            }
            System.out.println();
            m++;
        }
    }
}
//****
//****
//****
//****