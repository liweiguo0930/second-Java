package com.soft1841;

/**
 * 2019.3.10
 * @author 李伟国
 */
interface keyidong{
    public int getkeyidong();
}
interface kechangge {
    public int getkechangge();

    public class Jingling implements keyidong, kechangge {
        public static void main(String[] args) {
            System.out.println("可移动");
            System.out.println("可唱歌");
        }

        public int getkeyidong() {
            return 0;
        }

        public int getkechangge() {
            return 0;
        }
    }
}