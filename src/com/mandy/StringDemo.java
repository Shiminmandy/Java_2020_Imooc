package com.mandy;

public class StringDemo {
    public static void main(String[] args){
        //定义一个空字符串
        String s1="";
        System.out.println("s1="+s1);
        //定义一个字符串，内容是Hello
        String s2="Hello";
        System.out.println("s2="+s2);
        //定义一个包含unicode字符的字符串
        String s3="A\u005d\u005fB";
        System.out.println("s3="+s3);
        //定义一个包含空格的字符串
        String s4="Hello Mandy!";
        System.out.println("s4="+s4);
    }
}
//s1=
//s2=Hello
//s3=A]_B
//s4=Hello Mandy!   空格数也会影响output
//char 用单引号，string用双引号
//char is one character. String is zero or more characters.
//
//char is a primitive type. String is a class.