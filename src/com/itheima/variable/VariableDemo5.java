package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo5 {
    public static void main(String[] args) {
        
        // 键盘录入：
        // 1.呼叫scanner 打工人
        // 2.叫这个人干活

        // 1.呼叫scanner 打工人
        Scanner sc = new Scanner(System.in);

        // 2.叫这个人干活

        //录入一个整数
        int num1 = sc.nextInt();
        System.out.println(num1);

        //录入一个小数
        double num2 = sc.nextDouble();
        System.out.println(num2);

        //录入一个字符串
        String str = sc.next();
        System.out.println(str);







    }

}
