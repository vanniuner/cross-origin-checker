package com.cors.checker.vo;

import java.util.List;

import com.cors.checker.error.CorsError;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author author
 * @time 2022-02-24 14:14:12
 **/
@Data
@NoArgsConstructor
public class CrosCheckerResult {

    List<CorsError> errorList;

    boolean crosStatus;
}
