package com.Array;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args){
        //定义一个三行两列的整型二维数组intArray
        int[][] intArray=new int[3][2];
        Scanner sc=new Scanner(System.in);
        //从键盘输入学生成绩，要求输入顺序与效果图一致
        int sum1=0,sum2=0;
        int avg1=0,avg2=0;
        for(int i=0;i<intArray.length;i++){
            for(int j = 0; j<intArray[i].length; j++){
                if(j==0){
                    System.out.println("请输入第"+(i+1)+"个学生的语文成绩:");
                    intArray[i][j]=sc.nextInt();
                    sum1+=intArray[i][0];
                    avg1=sum1/intArray.length;
                }else{
                    System.out.println("请输入第"+(i+1)+"个学生的数学成绩:");
                    intArray[i][j]=sc.nextInt();
                    sum2+=intArray[i][1];
                    avg2=sum2/intArray.length;
                }
            }
        }
        //求语文的总成绩和平均分
        System.out.println("语文的总成绩为："+sum1);
        System.out.println("语文的平均分为："+avg1);
        //求数学的总成绩和平均分
        System.out.println("数学的总成绩为："+sum2);
        System.out.println("数学的平均分为："+avg2);
        }
    }

/*
请输入第1个学生的语文成绩:
78
请输入第1个学生的数学成绩:
98
请输入第2个学生的语文成绩:
95
请输入第2个学生的数学成绩:
100
请输入第3个学生的语文成绩:
75
请输入第3个学生的数学成绩:
80
78   98
95   100
75   80
语文的总成绩为：248
语文的平均分为：82
数学的总成绩为：278
数学的平均分为：92

 */