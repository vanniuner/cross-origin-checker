package com.cors.checker.error;

import com.cors.checker.context.WannaRequestThd;
import com.cors.checker.enums.SpecialHeader;
import com.cors.checker.qo.WanaRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * orgion and url do not match
 * @author author
 * @time 2022-02-24 12:36:11
 **/
@Data
@Slf4j
@SuppressWarnings({ "unused" })
@EqualsAndHashCode(callSuper = true)
public class OriginMatchFailError extends CorsError {

    private static final transient String MESSAGE = "Origin head: %s and request url %s domain do not match.";

    public OriginMatchFailError() {
        WanaRequest wanaRequest = WannaRequestThd.WANA_REQUEST_THD.get();
        super.message = String.format(MESSAGE, wanaRequest.getHeader(SpecialHeader.ORIGIN), wanaRequest.getUrl());
    }


}
