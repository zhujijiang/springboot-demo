package com.zjj.code.service.impl;

import com.zjj.code.service.TestService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author zhujijiang
 * @date 2020-07-18 下午4:03
 */

@Service
public class TestServiceImpl implements TestService {


    @Async
    @Override
    public void sleep() throws Exception {
        Thread.sleep(1000*4);
    }
}