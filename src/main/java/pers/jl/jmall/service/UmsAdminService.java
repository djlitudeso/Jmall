package pers.jl.jmall.service;

import pers.jl.jmall.mbg.entity.UmsAdmin;
import pers.jl.jmall.mbg.entity.UmsPermission;

import java.util.List;

/**
 * @ClassName: UmsAdminService.java
 * @Description: 后台管理员Service
 * @author: JL Du
 * @date: 2022/2/26 23:03
 * @version: 1.0.0
 */

public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);

}

