package com.cors.checker.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.cors.checker.enums.Empty;
import com.cors.checker.enums.SpecialHeader;
import com.cors.checker.error.CorsError;
import com.cors.checker.error.OriginEmptyError;
import com.cors.checker.error.OriginMatchFailError;
import com.cors.checker.qo.WanaRequest;

import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author author
 * @time 2022-02-24 13:06:33
 **/
@Data
@Slf4j
@Service
@NoArgsConstructor
@SuppressWarnings({ "unused" })
public class OriginChecker implements CrosChecker {


    private static final String MESSAGE = "Origin head: %s and request url %s domain do not matchs.";

    @Override
    public List<CorsError> check(WanaRequest wanaRequest) {
        final List<CorsError> corsErrorList = new ArrayList<>();
        String wanaOrigin = wanaRequest.getHeader(SpecialHeader.ORIGIN);
        if(wanaOrigin.equals(Empty.STR)){
            OriginEmptyError originEmptyError = new OriginEmptyError();
            corsErrorList.add(originEmptyError);
        }
        if (!wanaRequest.getUrl().contains(wanaOrigin)) {
            OriginMatchFailError originMatchFailError = new OriginMatchFailError();
            corsErrorList.add(originMatchFailError);
        }
        return corsErrorList;
    }

    @Override
    public Integer getOrder() {
        return 100;
    }

}
