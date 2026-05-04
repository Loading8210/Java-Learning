package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 后面不再需要重复这行代码

        System.out.println("请输入第一个数：");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数：");
        double b = sc.nextDouble();
        double c = a + b;
        System.out.println("两个数的和是：" + c);
    }

}
