package com.junmeng.client;

import com.junmeng.server.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author james
 * @date 2020/3/3
 */
public class CxfClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cxf-client.xml");
        HelloService client = (HelloService)context.getBean("helloClient");
        String result = client.sayHello("fgdda");
        System.out.println(result);
    }

}
