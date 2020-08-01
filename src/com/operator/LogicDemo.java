package com.operator;

import java.util.Scanner;

public class LogicDemo {
    public static void main(String[] args){
        //输入一个整数
        System.out.println("请输入一个整数:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(!(n%3==0)){
            System.out.println(n+"不能被3整除！");
        }else{
            System.out.println(n+"能被3整除！");
        }
    }
}
//短路运算符&&  ||: 短路或的运算是，如果第一个表达式的结果是true就不执行第二个表达式了，如果是false会继续执行第二个表达式