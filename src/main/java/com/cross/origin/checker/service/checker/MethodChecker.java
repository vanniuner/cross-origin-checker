package com.cross.origin.checker.service.checker;

import java.util.ArrayList;
import java.util.List;

import com.cross.origin.checker.error.CrossOriginError;
import com.cross.origin.checker.error.SimpleRequestHttpMethodError;
import com.cross.origin.checker.qo.WanaRequest;
import com.cross.origin.checker.service.CrossOriginChecker;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author author
 * @time 2022-02-25 10:01:11
 * @link https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#examples_of_access_control_scenarios
 **/
@Data
@Slf4j
@Service
@NoArgsConstructor
public class MethodChecker implements CrossOriginChecker {

    @Value("${checker.order.MethodChecker}")
    int methodCheckerOrder;

    @Override
    public Integer getOrder() {
        return methodCheckerOrder;
    }

    @Override
    public List<CrossOriginError> check(WanaRequest wanaRequest) {
        List<CrossOriginError> result = new ArrayList<>();
        boolean equalsAny = StringUtils.equalsAny(wanaRequest.getMethod(), HttpMethod.GET.name(), HttpMethod.POST.name(),
            HttpMethod.HEAD.name());
        if (!equalsAny) {
            SimpleRequestHttpMethodError simpleRequestHttpMethodError = new SimpleRequestHttpMethodError();
            result.add(simpleRequestHttpMethodError);
        }
        return result;
    }

}
