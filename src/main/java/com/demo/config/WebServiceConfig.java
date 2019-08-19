package com.demo.config;

import com.demo.service.ISayGoodByeService;
import com.demo.service.ISayHelloService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import javax.xml.ws.Endpoint;
 
/* @Desc: webservice配置
 * @author:zhengs  
 * @Time: 2019/8/12 10:31
 * @Copyright: © zhengs 版权所有  
 */
@Configuration
public class WebServiceConfig {
 
    @Autowired
    private ISayHelloService sayHelloService;

    @Autowired
    private ISayGoodByeService sayGoodByeService;
 
    /**
     * 注入servlet  bean name不能dispatcherServlet 否则会覆盖dispatcherServlet
     * @return
     */
    @Bean(name = "cxfServlet")
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(),"/webservice/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
 
    /**
     * 注册sayHello接口到webservice服务
     * @return
     */
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), sayHelloService);
        endpoint.publish("/sayHello");
        return endpoint;
    }

    /**
     * 注册sayGoodBye接口到webservice服务
     * @return
     */
    @Bean
    public Endpoint endpoint2() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), sayGoodByeService);
        endpoint.publish("/sayGoodBye");
        return endpoint;
    }
}