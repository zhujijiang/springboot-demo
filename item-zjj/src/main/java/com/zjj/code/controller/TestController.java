package com.zjj.code.controller;

import com.zjj.code.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhujijiang
 * @date 2020-07-18 下午3:49
 */
@RestController
@RequestMapping("test")
public class TestController {


    @Autowired
    private TestService testService;

    @RequestMapping("hello")
    public String hello(String type) throws Exception {
        return "hello boy";
    }

    @RequestMapping("say")
    public String test(String type) throws Exception {

        if("1".equals(type)){
            testService.sleep();
        }else{
            test2();
        }

        return "hello";
    }

    /**
     * 此注解不能实现异步
     * 必须要加一个代理类
     * @throws Exception
     */
    @Async

    public void test2() throws Exception {

        Thread.sleep(1000 * 4);

    }


}