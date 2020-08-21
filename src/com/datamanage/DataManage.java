package com.datamanage;

import javax.xml.crypto.Data;
import java.util.Scanner;

/**
 * 从键盘接收整型戴护具存放到数组中，并对数组中的数据进行管理
 */
public class DataManage {
    /**
     * 从键盘接收数据
     * @return 接收数据的数组
     */
    public int[] insertData(){
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);
        //少接收一个爱护据，为在指定位置处插入数据做准备
        for(int i=0;i<a.length-1;i++) {
            System.out.println("请输入第" + (i + 1) + "个数据：");
            try{
                a[i] = sc.nextInt();
            }catch(java.util.InputMismatchException e){// e 很重要
                System.out.println("输入的格式有误，不能有非数字！");
                sc.next();//接收字符串，前面只能接收整型数据
                i--;//确保输入非数字后在同一个顺序重新输入
            }

        }
        return a;
    }
    public static void main(String[] args){
        DataManage dm=new DataManage();
        int[] a=dm.insertData();
        for(int n:a){
            System.out.print(n+"   ");
        }
    }
}
