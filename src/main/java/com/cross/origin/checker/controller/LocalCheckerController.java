package com.cross.origin.checker.controller;

import com.cross.origin.checker.context.WannaRequestThd;
import com.cross.origin.checker.qo.WanaRequest;
import com.cross.origin.checker.service.LocalCrosChecker;
import com.cross.origin.checker.vo.CrossCheckerResult;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(path = "/local/checker")
@SuppressWarnings({ "unused" })
public class LocalCheckerController {

    @Autowired
    LocalCrosChecker localCrosChecker;

    @PostMapping("execute")
    public CrossCheckerResult execute(@RequestBody WanaRequest wanaRequest) {
        WannaRequestThd.WANA_REQUEST_THD.set(wanaRequest);
        CrossCheckerResult crosCheckerResult = localCrosChecker.check(wanaRequest);
        WannaRequestThd.WANA_REQUEST_THD.remove();
        return crosCheckerResult;
    }

}
