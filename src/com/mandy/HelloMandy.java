package com.mandy;

public class HelloMandy {  // "HelloMandy" 是一个标识符(identifier)

    // class HelloMandy{} can also work
// public class(定义类) HelloMandy(类的名字){} 是一个类，public static void main(String[] args){}是嵌套在类里面的主方法
    public static void main(String[] args) {// args 可以随意变换，但其他不可改变
            System.out.println("Hello,Imooc!");
            System.out.println("Hi,Mandy!");
            //不换行输入
            System.out.print("你好！");
            System.out.println("Hello,World! Hi,Mandy!");
            System.out.println("Hello, world");
            // we will get:
            // Hello,Imooc! Hi,Mandy
            //你好！Hello,World! Hi,Mandy
        }

}
