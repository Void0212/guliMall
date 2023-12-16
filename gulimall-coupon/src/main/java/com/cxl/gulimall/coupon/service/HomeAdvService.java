package com.cxl.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxl.common.utils.PageUtils;
import com.cxl.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author AtoposVoid
 * @email c1019071457@gmail.com
 * @date 2023-12-16 11:16:05
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

