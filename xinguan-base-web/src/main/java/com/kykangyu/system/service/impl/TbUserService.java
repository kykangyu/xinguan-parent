package com.kykangyu.system.service.impl;

import com.kykangyu.system.entity.TbUser;
import com.kykangyu.system.mapper.TbUserMapper;
import com.kykangyu.system.service.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author kykangyu
 * @since 2020-09-16
 */
@Service
public class TbUserService extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
