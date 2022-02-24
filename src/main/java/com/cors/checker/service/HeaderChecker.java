package com.cors.checker.service;

import java.util.List;

import com.cors.checker.error.CorsError;
import com.cors.checker.qo.WanaRequest;

import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author author
 * @time 2022-02-24 14:21:43
 **/
@Data
@Slf4j
@Service
@NoArgsConstructor
@SuppressWarnings({ "unused" })
public class HeaderChecker implements CrosChecker {

    @Override
    public List<CorsError> check(WanaRequest wanaRequest) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer getOrder() {
        return 200;
    }

}
