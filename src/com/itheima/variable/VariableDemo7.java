package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {
        
        // BIM = 体重 / 身高的平方
        // 体重单位：kg
        // 身高单位：m

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重（kg）：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高（m）：");
        double height = sc.nextDouble();
        System.out.println("你的BMI为:" + weight / (height * height));


    }

}
