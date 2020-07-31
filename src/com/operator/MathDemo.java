package com.operator;

public class MathDemo {
    public static void main(String[] args){
        int num1=10,num2=5;
        int result;//定义一个变量result存放结果
        //加法
        result=num1+num2;
        System.out.println(num1+"+"+num2+"="+result);
        //字符串连接
        System.out.println(num1+num2);
        System.out.println(""+num1+num2);
        //10+5=15
        //15    前面是数字所以进行数字相加
        //105  前面是字符串所以后面也进行字符串相加

        //减法
        result=num1-num2;
        System.out.println(num1+"-"+num2+"="+result);
        //乘法
        result=num1*num2;
        System.out.println(num1+"*"+num2+"="+result);
        //除法
        result=num1/num2;
        System.out.println(num1+"/"+num2+"="+result);
        //分子分母都是整型时，结果为整数
        System.out.println(13/5);
        System.out.println("13.0/5"+"="+13.0/5);
        System.out.println("19/3.0"+"="+19/3.0);

        //10-5=5
        //10*5=50
        //10/5=2
        //2
        //13.0/5=2.6
        //19/3.0=6.333333333333333

        //求余数
        result=13%num2;
        System.out.println("13%"+num2+"="+result);
        System.out.println("13.5%5="+(13.5%5));//加小数点，余数也会有小数点
        //13%5=3
        //13.5%5=3.5
    }
}
