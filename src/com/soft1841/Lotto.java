package com.soft1841;

import java.util.Random;

/**
 * 大乐透号码生成器
 * @auther 李伟国
 * 2019.3.12
 */
public class Lotto {
    public static void main(String[] args) {
        //创建随机数种子
        Random random = new Random();
        //循环五组号码
        for (int i = 0; i < 5; i++) {
            int[] before = new int[5];
            int[] after = new int[2];
            //循环5个0到35不重复号码
            for (int j = 0; j < 5; j++) {
                before[j] = random.nextInt(35) + 1;
                for (int k = 0; k < j; k++) {
                    if (before[k] == before[j]) {
                        j--;
                        break;
                    }
                }
            }
            //循环2个0到12不重复号码
            for (int j = 0; j < 2; j++) {
                after[j] = random.nextInt(12) + 1;
                for (int k = 0; k < j; k++) {
                    if (after[k] == after[j]) {
                        j--;
                        break;
                    }
                }
            }
            for (int j = 0; j < 5; j++) {
                System.out.print(before[j] + " ");
            }
            System.out.print("    ");
            for (int j = 0; j < 2; j++) {
                System.out.print(after[j] + " ");
            }
            System.out.println();
        }
    }
}
