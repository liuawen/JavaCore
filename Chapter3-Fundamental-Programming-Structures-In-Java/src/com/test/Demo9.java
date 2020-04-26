package com.test;

import java.util.Scanner;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-03-15 14:50
 * 问题描述
 * 　　小明有一块空地，他将这块空地划分为 n 行 m 列的小块，每行和每列的长度都为 1。
 * 　　小明选了其中的一些小块空地，种上了草，其他小块仍然保持是空地。
 * 　　这些草长得很快，每个月，草都会向外长出一些，如果一个小块种了草，则它将向自己的上、下、左、右四小块空地扩展，这四小块空地都将变为有草的小块。
 * 　　请告诉小明，k 个月后空地上哪些地方有草。
 * 输入格式
 * 　　输入的第一行包含两个整数 n, m。
 * 　　接下来 n 行，每行包含 m 个字母，表示初始的空地状态，字母之间没有空格。如果为小数点，表示为空地，如果字母为 g，表示种了草。
 * 　　接下来包含一个整数 k。
 * 输出格式
 * 　　输出 n 行，每行包含 m 个字母，表示 k 个月后空地的状态。如果为小数点，表示为空地，如果字母为 g，表示长了草。
 * 样例输入
 * 4 5
 * .g...
 * .....
 * ..g..
 * .....
 * 2
 * 样例输出
 * gggg.
 * gggg.
 * ggggg
 * .ggg.
 * 评测用例规模与约定
 * 　　对于 30% 的评测用例，2 <= n, m <= 20。
 * 　　对于 70% 的评测用例，2 <= n, m <= 100。
 * 　　对于所有评测用例，2 <= n, m <= 1000，1 <= k <= 1000。
 */
public class Demo9 {
    public static int[][] bool;
    public static int[] start;
    public static int[] end;
    public static char[][] num  ;
    public static int k = 0, n = 0, m = 0;
    public static int[] x = { 0, 1, 0, -1 };
    public static int[] y = { 1, 0, -1, 0 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        num = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            num[i] = s.toCharArray();
        }
        k = sc.nextInt();
        sc.close();
        start = new int[m * n];
        end = new int[m * n];
        int temp = 0;
        bool = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (num[i][j] == 'g') {
                    start[temp] = i;
                    end[temp++] = j;
                }
                else{
                    bool[i][j]=-1;
                }
            }
        }
        for (int i = 0; i < temp; i++) {
            dfs(start[i],end[i],k);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }

    public static void dfs(int xx, int yy, int kk) {

        bool[xx][yy]=kk;
        num[xx][yy]='g';
        for (int i = 0; i < 4; i++) {
            int newx = x[i] + xx;
            int newy = y[i] + yy;
            if ( newx >= 0 && newy >= 0 && newx < n && newy < m&&  kk - 1 > bool[newx][newy]) {
                dfs(newx, newy, kk - 1);
            }
        }
    }
}
