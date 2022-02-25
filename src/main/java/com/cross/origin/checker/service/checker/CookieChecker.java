package com.cross.origin.checker.service.checker;

import java.util.List;

import com.cross.origin.checker.error.CrossOriginError;
import com.cross.origin.checker.qo.WanaRequest;
import com.cross.origin.checker.service.CrossOriginChecker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author author
 * @time 2022-02-24 15:09:14
 **/
@Data
@Slf4j
@Service
@NoArgsConstructor
@SuppressWarnings({ "unused" })
public class CookieChecker implements CrossOriginChecker {

    @Value("${checker.order.CookieChecker}")
    int cookieCheckerOrder;

    @Override
    public Integer getOrder() {
        return cookieCheckerOrder;
    }

    @Override
    public List<CrossOriginError> check(WanaRequest wanaRequest) {
        // TODO Auto-generated method stub
        return null;
    }

}
