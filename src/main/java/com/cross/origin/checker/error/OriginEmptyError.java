package com.cross.origin.checker.error;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author author
 * @time 2022-02-24 14:52:57
 **/
@Data
@Slf4j
@SuppressWarnings({ "unused" })
@EqualsAndHashCode(callSuper = true)
public class OriginEmptyError extends CrossOriginError {

    public OriginEmptyError() {
        super.message = "Origin header is null.";
    }

}
