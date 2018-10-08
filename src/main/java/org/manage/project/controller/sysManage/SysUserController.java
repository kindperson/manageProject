package org.manage.project.controller.sysManage;

import org.manage.project.common.base.Page;
import org.manage.project.entity.sysManage.SysUser;
import org.manage.project.service.sysManage.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    /**
     * 访问注册页面
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/sysUserIndex",method ={RequestMethod.POST,RequestMethod.GET})
    public String sysUserIndex( ModelMap modelMap) {
        return "org/manage/project/storage/sysManage/sysUserIndex";
    }

    /**
     * 添加新用户
     * @return
     */
    @RequestMapping(value = "/inserSysUser",method ={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public Boolean inserSysUser(@RequestBody SysUser sysUser) {
        return sysUserService.insertSysUser(sysUser);
    }

    @RequestMapping(value = "/selectList",method ={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public Page selectList(@RequestBody SysUserParam param) {
        return sysUserService.selectList(param);
    }
}
