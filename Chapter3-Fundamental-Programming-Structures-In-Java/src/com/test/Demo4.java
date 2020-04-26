package com.test;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-03-15 14:40
 * 问题描述
 * 　　在1至2019中，有多少个数的数位中包含数字9？
 * 　　注意，有的数中的数位中包含多个9，这个数只算一次。例如，1999这个数包含数字9，在计算只是算一个数。
 * 答案提交
 * 　　这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 */
public class Demo4 {
    public static int count=0;
    public static boolean check(int n){
        while(n>0){
            if(n%10==9)return true;
            n/=10;
        }
        return false;
    }
    public static void main(String[] args) {
        for(int i=0;i<=2019;i++){
            if(check(i)){
                count++;
            }
        }
        System.out.println(count);
    }

}
