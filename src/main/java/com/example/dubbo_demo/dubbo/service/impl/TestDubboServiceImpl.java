package com.example.dubbo_demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.TestDubbo;
import org.springframework.stereotype.Component;

/**
 * @author : Wenyu Zhou
 * @version : v1.0
 * @date : 2019/10/16
 * description : 描述
 */
@Component
@Service(version = "1.0.0")
public class TestDubboServiceImpl implements TestDubbo {
    @Override
    public String sayTest() {
        return "test success v1.0.0";
    }
}
