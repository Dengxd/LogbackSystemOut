package com.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MyApplication {


    private static Logger logger = LoggerFactory.getLogger(MyApplication.class);

    public static void main(String[] args) {

        MyLog.init();//程序启动时运行这个方法
        SpringApplication.run(MyApplication.class,args);
        System.out.println("===============mytest===============");
        Integer i=100;
        System.err.println(i);
        try{
            Integer t=100/0;
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
