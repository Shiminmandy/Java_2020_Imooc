package com.Array;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args){
        //求整型数组的累加和
        //定义整型数组
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        //从键盘接收数据，为数组元素赋值
        for(int i=0;i<a.length;i++){
            System.out.println("请输入第"+(i+1)+"个元素：");
            a[i]=sc.nextInt();
        }
        System.out.println("数组元素的内容为：");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"   ");
        }
        System.out.println();
        System.out.println("使用增强型for循环输出数组内容：");
        for(int n:a){
            System.out.print(n+"   ");
        }
        //求数组元素的累加和
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println();
        System.out.println("数组元素的累加和为："+sum);
    }
}
/*
请输入第1个元素：
1
请输入第2个元素：
3
请输入第3个元素：
5
请输入第4个元素：
7
请输入第5个元素：
9
数组元素的内容为：
1   3   5   7   9
使用增强型for循环输出数组内容：
1   3   5   7   9
数组元素的累加和为：25
 */