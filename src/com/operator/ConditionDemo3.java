package com.operator;

public class ConditionDemo3 {
    public static void main(String[] args){
        int a=10,b=7;
        //求a和b的最大值
        int max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        System.out.println("max="+max);
        //三目条件运算符
        max=a>b?a:b;
        System.out.println("max="+max);
        boolean b1=a>b?(3<6|3<1):(true==false);
        System.out.println("b1="+b1);
    }
}
