package com.cross.origin.checker.controller;

import com.cross.origin.checker.qo.WanaRequest;
import com.cross.origin.checker.vo.CrosCheckerResult;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author author
 * @time 2022-02-24 15:34:39
 **/
@Data
@Slf4j
@RestController
@NoArgsConstructor
@RequestMapping(path = "/hand/checker")
public class HandCheckerController {

    @PostMapping("execute")
    public CrosCheckerResult execute(@RequestBody WanaRequest wanaRequest) {
        return null;
    }

}
