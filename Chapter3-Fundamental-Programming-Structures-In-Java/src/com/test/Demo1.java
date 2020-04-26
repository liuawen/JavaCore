package com.test;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-03-15 14:18
 * 问题描述
 * 　　在计算机存储中，15.125GB是多少MB？
 * 答案提交
 * 　　这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 */
public class Demo1 {
    public static void main(String[] args) {
        double num = 15.125;
        double result = num*1024.0;
        System.out.println(result);
    }
}
