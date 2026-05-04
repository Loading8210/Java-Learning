package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) {
        // 给定秒second，计算出多少小时，多少分钟，多少秒
        // 细节：1小时=3600秒，1分钟=60秒
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数：");
        int second = sc.nextInt();
        int hour = second / 3600;
        int second1 = second % 3600;
        int minute = second1 / 60;
        int second2 = second1 % 60;
        System.out.println(hour + " h " + minute + " m " + second2 + " s");


    }

}
