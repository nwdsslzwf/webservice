package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @Desc: webservice服务端启动类
 * @author:zhengs  
 * @Time: 2019/8/12 10:38
 * @Copyright: © zhengs 版权所有  
 */
@SpringBootApplication
public class WebServoceApplication {

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        SpringApplication.run(WebServoceApplication.class, args);
        Long endTime = System.currentTimeMillis();

        System.out.println("项目启动成功,共耗时:"+(endTime-startTime)/1000+"s");
    }
}
