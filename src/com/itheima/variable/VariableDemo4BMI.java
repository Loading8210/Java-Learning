package com.itheima.variable;

public class VariableDemo4BMI {
    public static void main(String[] args) {
        
        // BMI = 体重 / 身高的平方
        // 体重的单位：kg ， 身高的单位：m

        // 定义一个变量：体重
        //double weight = 50;

        // 定义一个变量：身高
        double height = 1.50;
        
        // 计算BMI
        //double bmi = weight / (height * height);
        
        // 输出BMI
        //System.out.println(bmi);

        // 计算，你当前的身高，在标准BMI下，体重最多是多少千克？
        // 标准BMI的范围是18.5-24.9
        // 体重 = BMI * 身高的平方
        // 我的身高：1.5m
        // 由 BMI = W / H^2 => W = BMI * H^2
        double maxWeight = 24.9 * (height * height);
        System.out.println(maxWeight);

    }

}
