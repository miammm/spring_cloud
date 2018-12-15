package com.spring.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 宋文强 on 2018/7/10.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://CLOUD-SERVICE/hi?name="+name,String.class);
//        return restTemplate.getForObject("http://windows10.microdone.cn:8762/hi?name="+name,String.class);
    }

}
