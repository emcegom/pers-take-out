package org.emcegom.project.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private Integer code;
    private String msg;
    private T data;
    private Map<String, String> map = new HashMap();


    public static <T> Result<T> success(T obj) {
        Result<T> r = new Result<>();
        r.setCode(1);
        r.setData(obj);
        return r;
    }

    public static <T> Result<T> error(String msg) {
        Result<T> r = new Result<>();
        r.setCode(0);
        r.setMsg(msg);
        return r;
    }

    public Result<T> add(String key, String value) {
        this.map.put(key, value);
        return this;
    }
}