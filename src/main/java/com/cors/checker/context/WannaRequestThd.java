package com.cors.checker.context;

import com.cors.checker.qo.WanaRequest;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author author
 * @time 2022-02-24 16:16:03
 **/
@Data
@NoArgsConstructor
public class WannaRequestThd {

    public static final ThreadLocal<WanaRequest> WANA_REQUEST_THD = ThreadLocal.withInitial(() -> {
        return null;
    });
}
