package com.neo.cors.checker.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.neo.cors.checker.qo.CheckerQo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author author
 * @time 2022-01-17 16:37:36
 **/
@Data
@Slf4j
@RestController
@RequestMapping(path = "/checker")
public class CheckerController {

    @PostMapping("with")
    public void checker(@RequestBody CheckerQo checkerQo) {
        log.info("\n==== [checkerQo]: {}", JSON.toJSONString(checkerQo, SerializerFeature.PrettyFormat));
        // 发送option请求，查看返回；区分有orgion、无orgion
        // 查验option请求的响应头，核心关注Access-Control-Allow-Origin、Access-Control-Allow-Credentials、Access-Control-Allow-Methods、Access-Control-Max-Age、Access-Control-Expose-Headers
        // Access-Control-Allow-Origin：
        // Access-Control-Allow-Credentials：
        // Access-Control-Allow-Methods：
        // Access-Control-Expose-Headers：
        // Access-Control-Max-Age：


        /**
         * 每次返回的部分，分别决定什么
         * 1、跨域响应头信息在option请求中返回
         * 2、跨域响应头信息在接口请求中返回
         */
    }

}
