package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 要求：键盘录入一个五位数，分别获取这个五位数的个位、十位、百位，千位，万位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个五位数：");
        int num = sc.nextInt();
        int ge = num % 10; // 个位
        int shi = num / 10 % 10 ; // 十位
        int bai = num / 100 % 10; // 百位
        int qian = num / 1000 % 10; // 千位
        int wan = num / 10000 % 10; // 万位
        System.out.println("这个数的个位：" + ge + "，十位：" + shi + "，百位：" + bai + "，千位：" + qian + "，万位：" + wan);



    }


}
