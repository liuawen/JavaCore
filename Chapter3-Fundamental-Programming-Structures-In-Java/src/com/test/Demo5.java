package com.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-03-15 14:44
 * 问题描述
 * 　　小明对类似于 hello 这种单词非常感兴趣，这种单词可以正好分为四段，第一段由一个或多个辅音字母组成，第二段由一个或多个元音字母组成，第三段由一个或多个辅音字母组成，第四段由一个或多个元音字母组成。
 * 　　给定一个单词，请判断这个单词是否也是这种单词，如果是请输出yes，否则请输出no。
 * 　　元音字母包括 a, e, i, o, u，共五个，其他均为辅音字母。
 * 输入格式
 * 　　输入一行，包含一个单词，单词中只包含小写英文字母。
 * 输出格式
 * 　　输出答案，或者为yes，或者为no。
 * 样例输入
 * lanqiao
 * 样例输出
 * yes
 * 样例输入
 * world
 * 样例输出
 * no
 * 评测用例规模与约定
 * 　　对于所有评测用例，单词中的字母个数不超过100。
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        ArrayList<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        char[] str = s.toCharArray();
        boolean bool = false;
        int temp = 0;
        for(
                int i = 0;
                i<str.length;i++)

        {
            if (bool) {
                if (!list.contains(str[i])) {
                    i--;
                    temp++;
                    bool = false;
                    continue;
                }
            } else {
                if (list.contains(str[i])) {
                    i--;
                    temp++;
                    bool = true;
                    continue;
                }
            }
        }
        if(temp==3)

        {
            System.out.println("yes");
        }
        else

        {
            System.out.println("no");
        }
    }
}