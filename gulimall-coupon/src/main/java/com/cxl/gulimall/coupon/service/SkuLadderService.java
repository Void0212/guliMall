package com.cxl.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxl.common.utils.PageUtils;
import com.cxl.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author AtoposVoid
 * @email c1019071457@gmail.com
 * @date 2023-12-16 11:16:05
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

