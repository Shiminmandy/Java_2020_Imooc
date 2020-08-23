package com.datamanage;

import java.util.Scanner;

public class DataHomework {
    public void displayMenu(){
        System.out.println("***************************************");
        System.out.println("           1--初始化数学成绩");
        System.out.println("           2--求成绩的平均值");
        System.out.println("           3--统计成绩大于85分的人数");
        System.out.println("           4--修改指定位置处的成绩");
        System.out.println("           5--打印输出所有成绩");
        System.out.println("           0--退出");
        System.out.println("***************************************");
    }
    public float[] initScore(){
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要储存的数学成绩的数量：");
        count=sc.nextInt();
        float[] a=new float[count];
        for(int i=0;i<a.length;i++){
            System.out.println("请输入第"+(i+1)+"个数据：");
            a[i]=sc.nextFloat();
        }
        return a;
    }
    public float averag(float[] f){
        float avg=0;
        float sum=0;
        for(float n:f){
            sum+=n;
            avg=sum/f.length;
        }
        return avg;
    }
    public int count(float[] f){
        int people=0;
        for(int i=0;i<f.length;i++){
            if(f[i]>85){
                people++;
            }
        }
        return people;
    }
    public static void main(String[] args){
        DataHomework dh=new DataHomework();
        dh.displayMenu();
        float[] a;
        a=dh.initScore();
        System.out.println(a);
        float[] f={1,2,3};
        float avg=dh.averag(f);
        System.out.println(avg);
    }
}
