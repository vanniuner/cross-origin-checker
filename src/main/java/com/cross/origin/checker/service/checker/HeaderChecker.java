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
 * @time 2022-02-24 14:21:43
 * @link https://fetch.spec.whatwg.org/#forbidden-header-name
 **/
@Data
@Slf4j
@Service
@NoArgsConstructor
@SuppressWarnings({ "unused" })
public class HeaderChecker implements CrossOriginChecker {

    @Value("${checker.order.HeaderChecker}")
    int headerCheckerOrder;

    @Override
    public List<CrossOriginError> check(WanaRequest wanaRequest) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer getOrder() {
        return headerCheckerOrder;
    }

}
