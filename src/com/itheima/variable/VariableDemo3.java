package com.itheima.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        // 定义8个基本数据类型的变量
        // 整数类型：byte, short, int, long
        // 浮点类型：float, double
        // 字符类型：char
        // 布尔类型：boolean   

        // byte类型

        // byte b = 999999999999999999999;
        // System.out.println(b);
        // 超出范围了

        // byte类型
        byte b = 127;
        System.out.println(b);

        // short类型
        short s = 2344;
        System.out.println(s);

        // int类型
        int i = -1233444;
        System.out.println(i);

        // long类型
        // 为什么long类型的变量要加L后缀？
        // 因为整数默认是int类型的，如果要表示long类型的整数，需要加上L后缀来告诉编译器这是一个long类型的整数。
        // 一般是大写
        long l = 1234567890123456789L;
        System.out.println(l);

        // float类型
        // 为什么float类型的变量要加F后缀？
        // 因为小数默认是double类型的，如果要表示float类型的小数，需要加上F后缀来告诉编译器这是一个float类型的小数。
        // 一般是大写
        float f = 3.1415926F;
        System.out.println(f);

        // double类型
        double d = 3.1415926535897932384626433832795;
        System.out.println(d);

        // char类型
        char c = '你';
        char c2 = '好';
        char c3 = 'A';
        System.out.println(c); 
        System.out.println(c2); 
        System.out.println(c3); 

        // boolean类型
        boolean flag = true;
        boolean flag2 = false;
        System.out.println(flag);
        System.out.println(flag2);


    }

}
