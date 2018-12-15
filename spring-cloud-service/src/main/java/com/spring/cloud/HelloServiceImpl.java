package com.spring.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by 宋文强 on 2018/7/11.
 */
@Service("iHelloService")
public class HelloServiceImpl implements IHelloService{

    @Value("${server.port}")
    String port;

    @Override
    public String hello(String name) {
        return "hi "+name+",i am from port:" + port;
    }
}
