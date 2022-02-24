package com.cors.checker.error;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * orgion 与 url 校验失败
 * @author author
 * @time 2022-02-24 12:36:11
 **/
@Data
@Slf4j
@NoArgsConstructor
@SuppressWarnings({ "unused" })
@EqualsAndHashCode(callSuper = true)
public class OriginMatchFailError extends CorsError {

}
