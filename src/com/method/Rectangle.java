package com.method;
//无参带返回值
public class Rectangle {
    //求长方形面积的方法
    public int area(){
        int length=10;
        int width=5;
        int area=length*width;
        return area;//返回语句
    }
    public static void main(String[] args){
        Rectangle rc=new Rectangle();
        System.out.println("长方形的面积为："+rc.area());
    }
}
