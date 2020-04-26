package com.test;

import java.util.Scanner;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-03-15 14:47
 * 问题描述
 * 　　一个正整数如果任何一个数位不大于右边相邻的数位，则称为一个数位递增的数，例如1135是一个数位递增的数，而1024不是一个数位递增的数。
 * 　　给定正整数 n，请问在整数 1 至 n 中有多少个数位递增的数？
 * 输入格式
 * 　　输入的第一行包含一个整数 n。
 * 输出格式
 * 　　输出一行包含一个整数，表示答案。
 * 样例输入
 * 30
 * 样例输出
 * 26
 * 评测用例规模与约定
 * 　　对于 40% 的评测用例，1 <= n <= 1000。
 * 　　对于 80% 的评测用例，1 <= n <= 100000。
 * 　　对于所有评测用例，1 <= n <= 1000000。
 */
public class Demo6 {
    public static int n=0,count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        f(0,1);
        System.out.println(count-1);
    }
    public static  void f(int num,int temp){
        if(num>n){
            return;
        }
        else{
            count++;
        }
        for (int i = temp; i <10; i++) {
            f(num*10+i,i);
        }
    }


}
