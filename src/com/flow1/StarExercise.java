package com.flow1;

public class StarExercise {
    public static void main(String[] args) {
        // 输出星号组成的梯形
        for (int out = 1; out <= 5; out++) {//外循环控制输出行数
            //第一个内循环控制输出的空格数
            for(int inn1=4;inn1>=out;inn1--){//一直从inn1=4开始
                System.out.print(" ");
            }//第二个内循环控制每行输出的星号数
            for(int inn2=1;inn2<=(out*2+1);inn2+=1){//一直从inn2=1开始
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* output：
     ***
    *****
   *******
  *********
 ***********
 */
