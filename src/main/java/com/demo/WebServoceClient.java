package com.demo;

import com.alibaba.fastjson.JSON;
import com.demo.bean.HelloBean;
import com.demo.util.SoapuiUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @Desc: webservice客户端启动类
 * @author:zhengs  
 * @Time: 2019/8/12 10:32
 * @Copyright: © zhengs 版权所有  
 */
@SpringBootApplication
public class WebServoceClient {

    public static void main(String[] args) {
        //postUrl为SoapUI工具测试的接口地址
        //param为SoapUI工具测试的参数内容
        HelloBean bean = new HelloBean("张三", 21);
        String param="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://service.demo.com/\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <ser:sayHello>\n" +
                "         <!--Optional:-->\n" +
                "         <jsonStr>"+ JSON.toJSONString(bean)+"</jsonStr>\n" +
                "      </ser:sayHello>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
        String postUrl = "http://localhost:10002/webservice/sayHello";
        String repXml= SoapuiUtil.doPostSoap1_1(postUrl, param, "");
        System.out.println(repXml);
    }
}
