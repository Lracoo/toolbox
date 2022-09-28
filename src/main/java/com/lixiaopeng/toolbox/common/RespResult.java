package com.lixiaopeng.toolbox.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 通用型相应
 */
@Data
public class RespResult {

    private final static int SUCCESS_CODE = 200;
    private final static int ERROR_CODE = 500;
    /**
     * 返回业务码用来判断成功失败
     * 200 成功
     * 500 失败
     */
    @ApiModelProperty("返回业务码用来判断成功失败(200:成功,500:失败)")
    private int code;

    /**
     * 描述
     */
    @ApiModelProperty("响应消息")
    private String message;

    /**
     * 描述
     */
    @ApiModelProperty("响应数据")
    private Object data;


    @ApiModelProperty("请求时间:请求时间戳（见请求参数")
    private Long requestTime;

    @ApiModelProperty("响应时间:响应时间戳")
    private Long responseTime = System.currentTimeMillis();

    public RespResult() {
    }

    public RespResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static RespResult success() {
        return getRespResult(SUCCESS_CODE, "", null);
    }

    public static RespResult success(Object data) {
        return getRespResult(SUCCESS_CODE, "", data);
    }

    public static RespResult success(String message, Object data) {
        return getRespResult(SUCCESS_CODE, message, data);
    }

    public static RespResult error(String message) {
        return getRespResult(ERROR_CODE, message, null);
    }

    public static RespResult error(int code, String message) {
        return getRespResult(code, message, null);
    }

    public static RespResult error() {
        return getRespResult(ERROR_CODE, "", null);
    }

    public static RespResult getRespResult(int code, String message, Object data) {
        return new RespResult(code, message, data);
    }
}