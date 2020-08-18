package com.method;
//可变参数列表(variable argument type)
public class ArgsDemo1 {
    //查找
    //参数列表中如果有两个以上的参数，可变参数一定是在最后的！
    //一个方法中只能有一个可变参数
    public void search(int n,int... a){
        //默认找不到
        boolean flag=false;
        for(int a1:a){
            if(a1==n){
                flag=true;
            }
        }
        if(flag){
            System.out.println("找到了"+n);
        }else{
            System.out.println("没找到"+n);
        }

    }
    public static void main(String[] args){
        ArgsDemo1 ad1=new ArgsDemo1();
        ad1.search(3,1,2,3,4,5);//若数组作为参数，是不能将多个值传递给数组的
        int[] a={1,2,3,4,5};
        ad1.search(3,a);
    }
}
