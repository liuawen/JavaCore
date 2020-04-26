package com.test;

import java.util.Scanner;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-03-15 14:50
 * 问题描述
 * 　　小明想知道，满足以下条件的正整数序列的数量：
 * 　　1. 第一项为 n；
 * 　　2. 第二项不超过 n；
 * 　　3. 从第三项开始，每一项小于前两项的差的绝对值。
 * 　　请计算，对于给定的 n，有多少种满足条件的序列。
 * 输入格式
 * 　　输入一行包含一个整数 n。
 * 输出格式
 * 　　输出一个整数，表示答案。答案可能很大，请输出答案除以10000的余数。
 * 样例输入
 * 4
 * 样例输出
 * 7
 * 样例说明
 * 　　以下是满足条件的序列：
 * 　　4 1
 * 　　4 1 1
 * 　　4 1 2
 * 　　4 2
 * 　　4 2 1
 * 　　4 3
 * 　　4 4
 * 评测用例规模与约定
 * 　　对于 20% 的评测用例，1 <= n <= 5；
 * 　　对于 50% 的评测用例，1 <= n <= 10；
 * 　　对于 80% 的评测用例，1 <= n <= 100；
 * 　　对于所有评测用例，1 <= n <= 1000。
 */
public class Demo8 {
    public static int n=0,count=0;
    public static int [] []map ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        sc.close();
        map = new int [n+1][n+1];
        for (int i = 1; i <=n; i++) {
            map[i][i]=1;
            map[i][0]=1;
            map[0][i]=1;
        }
        for (int i = 1; i <=n; i++) {
            count+=f(n,i);
            count%=10000;
//			System.out.println(count);
        }
        System.out.println(count);
//		 System.out.println(f(4,2));

    }
    public static int f(int x,int y){
        if(map[x][y]!=0){
            return map[x][y];
        }
        for (int i = Math.abs(x-y)-1; i>=0; i--) {
            map[x][y]+=f(y,i);
        }
        map[x][y]%=10000;
        map[y][x]=map[x][y];
        return map[x][y];
    }

}
