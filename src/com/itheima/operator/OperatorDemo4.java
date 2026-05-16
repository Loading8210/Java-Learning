package com.itheima.operator;
import java.util.Scanner;

public class OperatorDemo4 {
    public static void main(String[] args) {
 
        // 数字类型的转换
        byte num1 = 10;
        short num2 = 1200;
        int result1 =num1 + num2; // 先把num1转换成int,再把num2换成int,最后把num1和num2进行加法运算
        System.out.println(result1); 
        
        int num3 = 300;
        byte result2 = (byte)(num2 + num3); // 把num2和num3的结果强制转换成byte类型
        System.out.println(result2); // 因为强制转换，数据发生变化，所以结果是-36,而不是300+1200=1500

        byte num4 = 10;
        double num5 = 20.23;
        double result3 = (num4 + num5);
        System.out.println(result3);

        int num6 = 300;
        int num7 = 700;
        byte result4 = (byte)(num6 + num7); //结果应为1000,但是因为强制转换成byte类型，数据会发生变化
        System.out.println(result4); // -24
    }

}
