package com.itheima.variable;

public class VariablePracticeBMI {
    public static void main(String[] args) {
        //定义4个变量：name age hight weight
        //计算输出：我的名字叫xxx,BMI = weight/hight^2

        //定义一个变量：昵称
        String name = "Loading8210";

        //定义一个变量：年龄
        int age = 15;

        //定义一个变量：身高
        double height = 1.50;

        //定义一个变量：体重
        double weight = 50;

        //定义一个变量，计算BMI
        double BMI = weight / (height * height);

        //输出结果
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(BMI);
    }
}
