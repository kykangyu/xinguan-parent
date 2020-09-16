package com.kykangyu.system.service.impl;

import com.kykangyu.system.entity.TbMenu;
import com.kykangyu.system.mapper.TbMenuMapper;
import com.kykangyu.system.service.ITbMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author kykangyu
 * @since 2020-09-16
 */
@Service
public class TbMenuService extends ServiceImpl<TbMenuMapper, TbMenu> implements ITbMenuService {

}
