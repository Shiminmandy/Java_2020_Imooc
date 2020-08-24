package com.datamanage;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class DataHomework {
    /**
     * 提示信息
     */
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

    /**
     * 自定义数组长度，从键盘接收数据，初始化成绩
     * @return 返回成绩数组
     */
    public float[] initScore(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要储存的数学成绩的数量：");
        int count=1;
        try{
           count= sc.nextInt();
        }catch(java.util.InputMismatchException e){
            System.out.println("输入的格式有误，不能为非数字！");
            sc.next();
        }

        float[] a=new float[count];
        for(int i=0;i<count;i++){
            System.out.println("请输入第"+(i+1)+"个数据：");
            try{
                a[i] = sc.nextFloat();
            }catch(java.util.InputMismatchException e){
                System.out.println("输入的格式有误，不能为非数字！");
                sc.next();//没有这一行会进行死循环
                i--;
            }
        }
        return a;
    }

    /**
     * 求平均成绩
     * @param f (成绩)数组
     * @return 返回平均分
     */
    public float averag(float[] f){
        float avg=0;
        float sum=0;
        for(float n:f){
            sum+=n;
            avg=sum/f.length;
        }
        return avg;
    }

    /**
     * 数出成绩大于85分人数
     * @param f
     * @return接收人数
     */
    public int count(float[] f){
        int people=0;
        for(float n:f){
            if(n>85){
                people++;
            }
        }
        return people;
    }

    /**
     * 更新数据，从键盘接收位置和新成绩
     * @param f 数组
     * @param index 要修改的数据位置
     * @param newScore 新的成绩
     */
    public void update(float[] f, int index, float newScore){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入要修改数据的位置(从0开始)：");
//            index=sc.nextInt();
//            newScore=sc.nextFloat();
//        System.out.println("修改后：");
//        System.out.println("成绩为：");
        f[index]=newScore;

    }

    /**
     * 显示所有成绩
     * @param f 数组
     */
    public void displayAllScore(float[] f){
        System.out.println("成绩为：");
        for(float n:f){
            System.out.print(n+"   ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        DataHomework dh=new DataHomework();
        Scanner sc=new Scanner(System.in);
        int input;
        float[] f=null;
        float avg;
        int people;
        int index=0;
        float newScore=0;
        while(true){
            dh.displayMenu();
            System.out.println("请输入对应的数字进行操作：");
            try{
                input=sc.nextInt();
            }catch(java.util.InputMismatchException e){
                System.out.println("输入的格式有误，不能为非数字！");
                sc.next();
                continue;
            }
            if(input==0){
                System.out.println("退出程序！");
                break;
            }else if(input>5||input<0){
                System.out.println("超出操作范围，请重新选择操作！");
                continue;
            }
            switch(input){
                case 1:
                    //初始化成绩
                    f=dh.initScore();
                    break;
                case 2:
                    //求平均值
                    if(f!=null){
                        avg = dh.averag(f);
                        System.out.println("数学平均成绩为：" + avg);
                    }else{
                        System.out.println("还未初始化成绩，请重新选择操作！");
                    }
                    break;
                case 3:
                    //成绩>85人数
                    if(f!=null){
                        people = dh.count(f);
                        System.out.println("成绩大于85分的人数为：" + people);
                    }else{
                        System.out.println("还未初始化成绩，请重新选择操作！");
                    }
                    break;
                case 4:
                    //修改成绩
                    if(f!=null){
                        System.out.println("修改前：");
                        dh.displayAllScore(f);
                        System.out.println("请输入要修改数据的位置(从0开始)：");
                        try{
                            index = sc.nextInt();
                            System.out.println("请输入新数据：");
                            newScore = sc.nextFloat();
                        }catch(java.util.InputMismatchException e){
                            System.out.println("输入的格式有误，不能有非数字！");
                        }
                        dh.update(f,index,newScore);
                        System.out.println("修改后：");
                        dh.displayAllScore(f);
                    }else{
                        System.out.println("还未初始化成绩，请重新选择操作！");
                    }
                    break;
                case 5:
                    if(f!=null){
                        dh.displayAllScore(f);
                    }else{
                        System.out.println("还未初始化成绩，请重新选择操作！");
                    }
            }
        }
    }
}
