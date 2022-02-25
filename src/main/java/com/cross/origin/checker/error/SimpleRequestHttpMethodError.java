package com.cross.origin.checker.error;

import com.cross.origin.checker.context.WannaRequestThd;
import com.cross.origin.checker.qo.WanaRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author author
 * @time 2022-02-25 10:15:25
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class SimpleRequestHttpMethodError extends CrossOriginError {

    private static final transient String MESSAGE = "Http method %s is not one of them.";

    public SimpleRequestHttpMethodError() {
        WanaRequest wanaRequest = WannaRequestThd.WANA_REQUEST_THD.get();
        super.message = String.format(MESSAGE, wanaRequest.getMethod());
    }
}
