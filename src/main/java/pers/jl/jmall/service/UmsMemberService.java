package pers.jl.jmall.service;

import pers.jl.jmall.common.api.CommonResult;

/**
 * @ClassName: UmsMemberService.java
 * @Description: 会员管理Service
 * @author: JL Du
 * @date: 2022/2/26 23:45
 * @version: 1.0.0
 */

public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
