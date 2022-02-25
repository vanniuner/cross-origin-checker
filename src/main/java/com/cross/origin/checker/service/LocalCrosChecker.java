package com.cross.origin.checker.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.cross.origin.checker.error.CorsError;
import com.cross.origin.checker.qo.WanaRequest;
import com.cross.origin.checker.vo.CrosCheckerResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author author
 * @time 2022-02-24 11:23:24
 **/
@Data
@Slf4j
@Service
public class LocalCrosChecker {

    @Autowired
    ApplicationContext applicationContext;

    /**
     * local checker for CrosChecker list
     */
    public CrosCheckerResult check(WanaRequest wanaRequest) {
        CrosCheckerResult crosCheckerResult = new CrosCheckerResult();
        Map<String, CrosChecker> checkerMap = applicationContext.getBeansOfType(CrosChecker.class);
        List<CorsError> errorList = checkerMap.values().stream()
                .sorted(Comparator.comparing(CrosChecker::getOrder)).map(checker -> {
                    log.info("[loading local checker]: {}", checker.getClass().getSimpleName());
                    return checker.check(wanaRequest);
                }).reduce(new ArrayList<>(), (result, item) -> {
                    result.addAll(Optional.ofNullable(item).orElse(new ArrayList<>()));
                    return result;
                });
        crosCheckerResult.setErrorList(errorList);
        crosCheckerResult.setCrosStatus(errorList.size() > 0 ? true : false);
        return crosCheckerResult;
    }
    
}
