package com.wyx.springCloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestConfigController {

    @Value("${profile}")
    private String configValue;
    @RequestMapping("testConfig")
    public String test(){
        return "读取到配置中心：" + configValue;
    }
}
