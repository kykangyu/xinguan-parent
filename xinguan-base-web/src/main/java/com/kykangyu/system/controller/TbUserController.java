package com.kykangyu.system.controller;


import com.kykangyu.handler.BusinessException;
import com.kykangyu.response.Result;
import com.kykangyu.response.ResultCode;
import com.kykangyu.system.entity.TbUser;
import com.kykangyu.system.service.impl.TbUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author kykangyu
 * @since 2020-09-16
 */
@RestController
@RequestMapping("/system/tb-user")
@Api(value = "系统用户模块",tags = "系统用户接口")
public class TbUserController {
    @Autowired
    private TbUserService tbUserService;

    @GetMapping
    @ApiOperation(value = "用户列表",notes = "查询所有用户信息")
    public Result findUsers(){
        List<TbUser> list = tbUserService.list();
        return Result.ok().data("users",list);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查询单个用户",notes = "通过ID查询对应的用户信息")
    public Result getuserById(@PathVariable("id") Long id){
        TbUser user = tbUserService.getById(id);
        if(user!=null){
            return Result.ok().data("user",user);
        }else {
            throw new BusinessException(ResultCode.USER_ACCOUNT_NOT_EXIST.getCode(),ResultCode.USER_ACCOUNT_NOT_EXIST.getMessage());
        }
    }
}

