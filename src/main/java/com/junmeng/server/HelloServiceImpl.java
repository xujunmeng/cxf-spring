package com.junmeng.server;

import javax.jws.WebService;

/**
 * @author james
 * @date 2020/3/3
 */
@WebService(endpointInterface = "com.junmeng.server.HelloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String str) {
        return "hello, " + str;
    }
}
