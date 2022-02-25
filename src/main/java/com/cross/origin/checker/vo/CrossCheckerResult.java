package com.cross.origin.checker.vo;

import java.util.List;

import com.cross.origin.checker.error.CrossOriginError;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author author
 * @time 2022-02-24 14:14:12
 **/
@Data
@NoArgsConstructor
public class CrossCheckerResult {

    List<CrossOriginError> errorList;

    boolean crossOriginStatus;

    boolean simpleRequest;
}
