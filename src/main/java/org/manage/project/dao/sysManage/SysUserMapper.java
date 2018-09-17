package org.manage.project.dao.sysManage;

import org.manage.project.controller.sysManage.SysUserParam;
import org.manage.project.entity.sysManage.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper {
    /**
     * 添加用户
     * @param sysUser
     * @return
     */
    int inserSysUser(SysUser sysUser);

    /**
     * 分页查询用户信息
     * @param param
     * @return
     */
    List<SysUser> selectList(SysUserParam param);

    /**
     * 查询分页的总数
     * @param param
     * @return
     */
    Integer selectCount(SysUserParam param);
}
