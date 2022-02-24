package com.cors.checker.qo;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * the basic request
 *
 * @author author
 * @time 2022-01-17 16:50:38
 **/
@Data
@NoArgsConstructor
public class WanaRequest {

    // request url
    String url;

    // request header
    List<HeaderQo> headerList;

    // request cookie
    List<CookieQo> cookieList;

    // request body
    String requestBody;


}
