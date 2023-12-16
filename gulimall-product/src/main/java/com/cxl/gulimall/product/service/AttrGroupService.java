package com.cxl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxl.common.utils.PageUtils;
import com.cxl.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author AtoposVoid
 * @email c1019071457@gmail.com
 * @date 2023-12-15 16:44:08
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

