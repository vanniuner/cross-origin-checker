package com.cross.origin.checker.service;

import java.util.List;

import com.cross.origin.checker.error.CrossOriginError;
import com.cross.origin.checker.qo.WanaRequest;

/**
 * @author author
 * @time 2022-02-24 13:05:09
 **/
public interface CrossOriginChecker {

    Integer getOrder();

    List<CrossOriginError> check(WanaRequest wanaRequest);

}
