package com.flow1;

public class DoWhileDemo {
    public static void main(String[] args){
        //求1道5的累加和
        int n=1;
        int sum=0;
        do{
            sum+=n;
            n++;
        }while(n<=5);
        System.out.println("sum="+sum);
        System.out.println("n="+n);
    }
}
