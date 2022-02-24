package com.cors.checker.service;

import java.util.List;

import com.cors.checker.error.CorsError;
import com.cors.checker.qo.WanaRequest;

/**
 * @author author
 * @time 2022-02-24 13:05:09
 **/
public interface CrosChecker {

    Integer getOrder();

    List<CorsError> check(WanaRequest wanaRequest);

}
