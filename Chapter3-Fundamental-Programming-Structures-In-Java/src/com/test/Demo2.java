package com.test;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-03-15 14:21
 * 问题描述
 * 　　1200000有多少个约数（只计算正约数）。
 * 答案提交
 * 　　这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 */
public class Demo2 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <=1200000; i++) {
            if(1200000%i==0){
                count++;
            }
        }
        System.out.println(count);
    }

}
