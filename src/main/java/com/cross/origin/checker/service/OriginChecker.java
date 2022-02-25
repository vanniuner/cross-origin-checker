package com.cross.origin.checker.service;

import java.util.ArrayList;
import java.util.List;

import com.cross.origin.checker.enums.Empty;
import com.cross.origin.checker.enums.SpecialHeader;
import com.cross.origin.checker.error.CrossOriginError;
import com.cross.origin.checker.error.OriginEmptyError;
import com.cross.origin.checker.error.OriginMatchFailError;
import com.cross.origin.checker.qo.WanaRequest;

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
    public List<CrossOriginError> check(WanaRequest wanaRequest) {
        final List<CrossOriginError> crossOriginErrorList = new ArrayList<>();
        String wanaOrigin = wanaRequest.getHeader(SpecialHeader.ORIGIN);
        if(wanaOrigin.equals(Empty.STR)){
            OriginEmptyError originEmptyError = new OriginEmptyError();
            crossOriginErrorList.add(originEmptyError);
        }
        if (!wanaRequest.getUrl().contains(wanaOrigin)) {
            OriginMatchFailError originMatchFailError = new OriginMatchFailError();
            crossOriginErrorList.add(originMatchFailError);
        }
        return crossOriginErrorList;
    }

    @Override
    public Integer getOrder() {
        return 100;
    }

}
