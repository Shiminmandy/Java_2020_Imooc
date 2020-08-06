package com.flow1;

public class CharLoopDemo {
    public static void main(String[] args){
        //循环输出26个英文字母
        char ch='a';
        int count=1;//控制换行
        while(ch<='z'){
            System.out.println(ch+" ");
            if(count%13==0)
                System.out.println();
            count++;
            ch++;
        }
    }
}
