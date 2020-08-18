package com.method;

//参数传递问题
//对两个变量的值进行交换并打印输出
public class ExchangeDemo {
    //交换方法
    public void swap(int a,int b){
        int temp;
        System.out.println("交换前：a="+a+"，b="+b);
        temp=a;a=b;b=temp;
        System.out.println("交换后：a="+a+"，b="+b);
    }
    public void swapTest(){
        int m=4,n=5;
        System.out.println("交换前：m="+m+"，n="+n);
        swap(m,n);//无需对象名直接调用
        System.out.println("交换后：m="+m+"，n="+n);
    }
    public static void main(String[] args){
//        int m=4,n=5;
//        ExchangeDemo ec=new ExchangeDemo();
//        System.out.println("交换前：m="+m+"，n="+n);
//        ec.swap(m,n);
//        System.out.println("交换后：m="+m+"，n="+n);
          ExchangeDemo ec=new ExchangeDemo();
          ec.swapTest();
          //尽量减少主方法里面的代码
    }
}
