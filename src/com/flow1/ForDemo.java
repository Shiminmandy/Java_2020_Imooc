package com.flow1;

public class ForDemo {
    public static void main(String[] args){
        int sum=0;
        //三个表达式可省略
        for(int n=1;n<=5;n++){
            sum=sum+n;   //n++最后循环
            //局部变量只在定义它的大括号内有效
        }
        System.out.println("sum="+sum);
    }
}
