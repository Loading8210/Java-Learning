package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        // 算术运算符：+ - * / %

        // 整数计算：
        // 细节：整数计算的结果还是整数

        int num1 = 2;
        int num2 = 3;

        // 加法
        int result1 = num1 + num2;
        System.out.println(result1);

        // 减法
        int result2 = num1 - num2;
        System.out.println(result2);

        // 乘法
        int result3 = num1 * (num2 * num2);
        System.out.println(result3);

        // 除法
        int result4 = num1 / num2 / num1 / num1 ;
        System.out.println(result4);
        
        // 取余数
        int result5 = num2 % num1;
        System.out.println(result5);

        System.out.println("-------------------------------------------");

        // 小数计算：
        // 细节：小数计算的结果还是小数，有可能不精确
        double num3 = 100.0;
        double num4 = 30.0;

        double result6 = num3 + num4;
        System.out.println(result6);

        double result7 = num3 - num4;
        System.out.println(result7);
        
        double result8 = num3 * num4;
        System.out.println(result8);

        double result9 = num3 / num2;
        System.out.println(result9);

        double result10 = num3 % num4;
        System.out.println(result10);
        

    }

}
