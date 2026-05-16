package com.itheima.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        char c1 = 'A';
        int c2 = 'A';
        char c3 = (char)(67);
        char c4 = (char)(c1 + c2);
        System.out.println(c1); // A
        System.out.println(c2); // 65
        System.out.println(c3); // C
        System.out.println(c4); // 130
    }

}
