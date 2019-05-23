package com.soft1841.Decorator;

public class LoggerFileSystem implements Logger {

    @Override
    public void log(String message) {
        System.out.println("日志输出到文件系统"+message);
    }
}
