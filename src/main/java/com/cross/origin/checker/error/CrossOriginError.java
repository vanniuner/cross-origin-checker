package com.cross.origin.checker.error;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author author
 * @time 2022-02-24 13:02:38
 **/
@Data
@NoArgsConstructor
public abstract class CrossOriginError {

    public String message;

}
