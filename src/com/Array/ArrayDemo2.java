package com.Array;

public class ArrayDemo2 {
    public static void main(String[] args){
        //求数组元素的最大值
        int[] a={34,64,75,34,65,100};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("数组最大值为："+max);
    }
}
//数组最大值为：100