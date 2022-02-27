package pers.jl.jmall.mapper;

import org.apache.ibatis.annotations.Param;
import pers.jl.jmall.mbg.entity.UmsPermission;

import java.util.List;

/**
 * TODO：后台用户与角色管理自定义Dao
 * @author: JL Du
 * @date: 2022/2/26
 * @version: 1.0.0
 */

public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
