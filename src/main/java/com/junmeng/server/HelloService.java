package com.junmeng.server;

import javax.jws.WebService;

/**
 * Created by james on 2020/3/3.
 */
@WebService
public interface HelloService {

    String sayHello(String str);

}
