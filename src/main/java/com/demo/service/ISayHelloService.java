package com.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/* @Desc: webservice申明接口
 * @author:zhengs
 * @Time: 2019/8/12 10:30
 * @Copyright: © zhengs 版权所有
 */
@WebService
public interface ISayHelloService {
    @WebMethod
    String sayHello(@WebParam(name = "jsonStr")String jsonStr);
}