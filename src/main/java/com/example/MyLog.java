package com.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintStream;


public class MyLog {

    private static final Logger logger = LoggerFactory.getLogger(MyLog.class);



    /**
     * 把System.out和System.err替换为新的PrintStream,用logger.info代替System.out.print和System.err.print
     * @param SysPrintStream  可以是System.out和System.err
     * @return  返回新的PrintStream
     */
    public static PrintStream createMyPrintStream(final PrintStream SysPrintStream) {
        PrintStream myStream= new PrintStream(SysPrintStream) {
            public void print(final String string) {
                logger.info(string);
            }
        };
        return myStream;
    }

    /**
     * 在程序启动时运行这个函数，让logback接管Sytem.out和System.err
     */
    public static void init() {
        System.setOut(createMyPrintStream(System.out)); //替换System.out
        System.setErr(createMyPrintStream(System.err)); //替换System.err
    }
}