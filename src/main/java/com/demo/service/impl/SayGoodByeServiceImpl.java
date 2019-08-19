package com.demo.service.impl;

import com.demo.service.ISayGoodByeService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/* @Desc: webservice实现类
 * @author:zhengs  
 * @Time: 2019/8/12 10:31
 * @Copyright: © zhengs 版权所有  
 */
@Service
@WebService(serviceName = "ISayGoodByeService", // 与接口中指定的name一致
        targetNamespace = "http://demo.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.demo.service.ISayGoodByeService" // 接口地址
)
public class SayGoodByeServiceImpl implements ISayGoodByeService {
    @Override
    public String sayGoodBye(String jsonStr) {
        return "goodBye " + jsonStr;
    }
}
 
