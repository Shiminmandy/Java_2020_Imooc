package com.method;

public class ArrayDemo4 {
    public void updateArray(int[] a){
        a[3]=15;
        System.out.println("数组a的元素为 ：");
        for(int n:a){
            System.out.print(n+"   ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ArrayDemo4 ad4=new ArrayDemo4();
        int[] a1={1,2,3,4,5};
        System.out.println("方法调用前数组a1的元素为: ");
        for(int n:a1){
            System.out.print(n+"   ");
        }
        System.out.println();
        ad4.updateArray(a1);
        System.out.println("方法调用后数组a1的元素为: ");
        for(int n:a1) {
            System.out.print(n + "   ");//主方法受到影响
        }
    }
}
/*
方法调用前数组a1的元素为:
1   2   3   4   5
数组a的元素为 ：
1   2   3   15   5
方法调用后数组a1的元素为:
1   2   3   15   5
 */