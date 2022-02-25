package com.cross.origin.checker.service;

import java.util.List;

import com.cross.origin.checker.error.CorsError;
import com.cross.origin.checker.qo.WanaRequest;

/**
 * @author author
 * @time 2022-02-24 13:05:09
 **/
public interface CrosChecker {

    Integer getOrder();

    List<CorsError> check(WanaRequest wanaRequest);

}
