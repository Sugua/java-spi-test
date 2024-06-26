package com.sugar.edu.up.service;

import com.sugar.edu.up.spi.LoggerService;

/**
 * @Description todo
 * @Author sugar
 * @Date 2024/6/27 12:07 AM
 * @Version 1.0
 */
public class TestJavaSpi {

    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getService();
        loggerService.info("你好");
        loggerService.debug("测试Java SPI 机制");


    }
}
