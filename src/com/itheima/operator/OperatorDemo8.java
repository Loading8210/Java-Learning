package com.itheima.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        // +=
        // -+
        // *=
        // /=
        // %=
        int a = 100;
        int b = 200;
        a += b; // a = a + b;
        System.out.println(a); // 300
        a -= b; // a = a - b;
        System.out.println(a); // 100
        a *= b; // a = a * b;
        System.out.println(a); // 20000
        a /= b; // a = a / b;
        System.out.println(a); // 100
        a %= b; // a = a % b;
        System.out.println(a); // 100
    }

}
