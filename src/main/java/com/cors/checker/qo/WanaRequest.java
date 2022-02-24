package com.cors.checker.qo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.cors.checker.enums.Empty;

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

    public String getHeader(String headerName) {
        Map<String, String> headerMap = headerList.stream().collect(
            Collectors.toMap(head -> head.getName(), head -> head.getValue(), (head1, head2) -> head1, TreeMap::new));
        return headerMap.computeIfAbsent(headerName, key -> Empty.STR);
    }

    public String getCookie(String cookieName) {
        Map<String, String> cookieMap = cookieList.stream().collect(
            Collectors.toMap(cookie -> cookie.getName(), cookie -> cookie.getValue(), (cookie1, cookie2) -> cookie1, TreeMap::new));
        return cookieMap.computeIfAbsent(cookieName, key -> Empty.STR);
    }
    
}
