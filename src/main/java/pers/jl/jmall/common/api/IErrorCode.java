package pers.jl.jmall.common.api;

/**
 * @ClassName: IErrorCode
 * @Description: 封装API的错误码
 * @author: JL Du
 * @date: 2022/2/26
 * @version: 1.0.0
 */

public interface IErrorCode {
    long getCode();

    String getMessage();
}
