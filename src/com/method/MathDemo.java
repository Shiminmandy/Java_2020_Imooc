package com.method;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

//方法重载
public class MathDemo {
    //求两个int类型数的和
    public int plus(int m,int n){
        return m+n;
    }
    //求两个double类型数的和
    public double plus(double m,double n){
        return m+n;
    }
    //求数组元素累加和
    public int plus(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int m1=5,n1=3;
        int[] arr={1,2,3,4,45,6};
        MathDemo md=new MathDemo();
        System.out.println("int类型的和："+md.plus(m1,n1));
        System.out.println("double类型的和："+md.plus(5.6,7.8));
        System.out.println("数组元素的和："+md.plus(arr));
    }
}
