package com.operator;

import java.util.Scanner;//导入了才不会报错

public class ConditionDemo2 {
    public static void main(String[] args){
        //判断一个整数是奇数还是偶数，并将结果打印输出
        //定义一个变量存放数据
        //int n=10;
        //从键盘接收数据
        System.out.println("请输入一个整数:");
        Scanner s=new Scanner(System.in);//变量s可以改，其他不能改
        int n=s.nextInt();//调用方法，只能输入整数
        if(n%2==0){
            System.out.println(n+"是偶数！");
        }else{
            System.out.println(n+"是奇数！");
            //10是偶数！
        }
    }
}
