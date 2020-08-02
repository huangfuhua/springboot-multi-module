package com.hfh.springbootmultimodule.controller;

import com.hfh.springbootmultimodule.response.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangfuhua on 2019/4/25.
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping("test1")
    public Response test1() {
        return Response.builder().result(Response.RESULT_CODE.SUCCESS.getCode()).message("Hello World!").build();
    }
}
