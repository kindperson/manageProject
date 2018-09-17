package org.manage.project.service.sysManage;

import org.manage.project.common.base.Page;
import org.manage.project.controller.sysManage.SysUserParam;
import org.manage.project.entity.sysManage.SysUser;

/**
 * 用户表管理service
 */
public interface SysUserService {
    /**
     * 添加用户信息
     * @param sysUser
     * @return
     */
    public Boolean insertSysUser(SysUser sysUser);

    /**
     * 分页查询用户信息
     * @param param
     * @return
     */
    Page selectList(SysUserParam param);
}
