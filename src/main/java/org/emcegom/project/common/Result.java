package org.emcegom.project.common;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private boolean success;
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T obj) {

        return new Result<>(true, 1, null, obj);
    }

    public static <T> Result<T> error(String msg) {
        return new Result<>(false, 0, msg, null);
    }
}