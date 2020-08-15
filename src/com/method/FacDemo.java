package com.method;
//带参有返回值
public class FacDemo {
    //方法不能嵌套定义
    //求阶乘的方法
    public int fac(int n){//若是没有return就会报错
        int s=1;
        for(int i=1;i<=n;i++){
            s*=i;//s=s*i;
        }
        return s;

    }
    public static void main(String[] args){//主方法里面不能再添方法
        FacDemo facDemo=new FacDemo();
        int fac=facDemo.fac(3);
        System.out.println("3！="+fac);
        int sum=0;
        //求1!+2!+3!+4!+5!
        for(int i=1;i<=5;i++){
            fac=facDemo.fac(i);
            sum=sum+fac;
        }
        System.out.println("1!+2!+3!+4!+5!="+sum);
    }
}
