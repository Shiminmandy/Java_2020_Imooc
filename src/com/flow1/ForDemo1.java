package com.flow1;

public class ForDemo1 {
    public static void main(String[] args){
        //将10以下的整数打印输出
        int i=1;
        //for(;;)
        while(true){
            System.out.println(i + " ");
            if (i == 10) break;
            i++;
        }
    }
}