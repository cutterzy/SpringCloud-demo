package com.example.springcloud.hystirx;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class HystrixCommandDemo extends HystrixCommand<String> {

    private final String name;

    public HystrixCommandDemo(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;
    }


    @Override
    protected String run() throws Exception {
        return null;
    }
}
