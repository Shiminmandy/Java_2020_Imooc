package com.method;

public class ArgsDemo {
    //求和
    public void sum(int... n){
        //使用增强型for循环
        int sum=0;
        for(int i:n){
            sum=sum+i;
        }
        System.out.println("sum="+sum);
    }
    public static void main(String[] args){
        ArgsDemo ad=new ArgsDemo();
        ad.sum(1);
        ad.sum(1,2);
        ad.sum(1,2,3);
    }
}
