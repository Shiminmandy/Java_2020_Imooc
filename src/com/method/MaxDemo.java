package com.method;
//带参无返回值
public class MaxDemo {

    //求最大值的方法
    public void max(float a,float b){
        float max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        System.out.println("两个数"+a+"和"+b+"的最大值为："+max);
    }
    public static void main(String[] args){
        MaxDemo maxDemo=new MaxDemo();
        int a=5,b=3;
        maxDemo.max(a,b);
        float m=5.6f,n=9.7f;
        maxDemo.max(m,n);
        maxDemo.max(6.9f,1.4f);


    }
}
