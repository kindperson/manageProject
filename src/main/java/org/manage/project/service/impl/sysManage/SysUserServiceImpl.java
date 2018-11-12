package org.manage.project.service.impl.sysManage;

import org.apache.commons.lang3.StringUtils;
import org.manage.project.common.base.Page;
import org.manage.project.controller.sysManage.SysUserParam;
import org.manage.project.dao.sysManage.SysUserMapper;
import org.manage.project.entity.sysManage.SysUser;
import org.manage.project.service.sysManage.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public Boolean insertSysUser(SysUser sysUser) {
        sysUser.setCreateDate(new Date());
        int count = sysUserMapper.inserSysUser(sysUser);
        return count > 0;
    }

    @Override
    public Page selectList(SysUserParam param) {
        Integer total = sysUserMapper.selectCount(param);
        List<SysUser> sysUsers = sysUserMapper.selectList(param);
        Page<SysUser> page = new Page<>();
        page.setTotal(total);
        page.setPage(param.getPage());
        page.setPageSize(param.getPageSize());
        page.setDataList(sysUsers);
        return page;
    }
}
