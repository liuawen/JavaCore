package com.test;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-03-15 14:39
 */
public class Demo22 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=Math.sqrt(1200000);i++){
            if((1200000/i)*i==1200000){
                count++;
            }
        }
        System.out.println(count*2);
        System.out.println(Math.sqrt(1200000));
    }

}
