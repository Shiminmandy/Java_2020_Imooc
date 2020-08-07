package com.flow1;

import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args){
        //从键盘接收数据
        Scanner sc=new Scanner(System.in);
        int n;
        while(true){
            System.out.println("请输入1-10之间的数字 :");
            n=sc.nextInt();
            if(n==0)break;
            System.out.println("output: "+n);
        }
    }
}
