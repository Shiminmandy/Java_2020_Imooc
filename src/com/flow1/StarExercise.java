package com.flow1;

public class StarExercise {
    public static void main(String[] args) {
        // 输出星号组成的梯形
        for (int out = 1; out <= 5; out++) {
            for(int inn1=4;inn1>=out;inn1--){
                System.out.print("/");
            }
            for(int inn2=1;inn2<=(out*2+1);inn2+=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

