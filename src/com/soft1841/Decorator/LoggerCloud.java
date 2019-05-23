package com.soft1841.Decorator;


public  class LoggerCloud implements Logger {


    @Override
    public void log(String message) {
        System.out.println("日志输出到平台"+message);
    }
}