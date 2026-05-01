package com.itheima.variable;

public class variablepractice {
    public static void main(String[] args) {
        // 定义一个变量，表示我的零花钱：100元
        // 收红包得了1000元
        // 花了12元买下恶魔轮盘赌
        // 玩教室电脑没了800元
        
        // 定义一个变量，表示我的零花钱：100元
        double money = 100;

        // 收红包得了1000元
        money = money + 1000;

        // 花了12元买下恶魔轮盘赌
        money = money - 12;

        // 玩教室电脑没了800元
        money = money - 800;
        
        System.out.println(money);
    }

}
