package com.Array;

public class SortDemo {
    public static void main(String[] args){
        //冒泡排序
        int[] a={24,25,46,76,85,34};
        System.out.println("排序前的数组元素为：");
        for(int n:a){
            System.out.print(n+"   ");
        }
        System.out.println();
        int temp;
        for(int i=0;i<a.length-1;i++){
            //内重循环控制每趟排序
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("从小到大排序后的数组元素为：");
        //增强型for循环
        for(int n:a){
            System.out.print(n+"   ");
        }
        //增强型for循环例子
        int[] newArray={1,2,3,4,5,6,7};
        int total=0;
        //遍历一遍newArray,并把每一个值赋给x
        for(int x:newArray){
            total+=x;
        }
        System.out.println("total="+total);//total=28
    }
}
