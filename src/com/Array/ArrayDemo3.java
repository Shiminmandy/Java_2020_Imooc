package com.Array;

public class ArrayDemo3 {
    public static void main(String[] args){
        //二维数组的声明
        //三种形式
        //声明int类型的二维数组
        int[][] intArray;
        //声明float类型的二维数组
        float floatArray[][];
        //声明double类型的二维数组
        double[] doubleArray[];
        //创建一个三行三列的int类型的额数组
        intArray=new int[3][3];
        System.out.println("intArray数组的第3行第2列的元素为："+intArray[2][1]);
        //为第2行第3个元素赋值为9
        intArray[1][2]=9;
        System.out.println("intArray数组的第2行第3列的元素为："+intArray[1][2]);
        //声明数组的同时进行创建
        char[][] ch=new char[3][5];
        //创建float类型的数组时，只指定行数
        floatArray=new float[3][];
        //System.out.println(floatArray[0][0]); 有异常
        floatArray[0]=new float[3];//第一行有三列
        floatArray[1]=new float[4];//第二行有四列
        floatArray[2]=new float[5];//第一行有五列
        System.out.println(floatArray[0][0]);
        //System.out.println(floatArray[0][4]); 下标越界
    }
}
