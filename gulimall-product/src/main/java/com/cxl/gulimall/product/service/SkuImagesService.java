package com.cxl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxl.common.utils.PageUtils;
import com.cxl.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author AtoposVoid
 * @email c1019071457@gmail.com
 * @date 2023-12-15 16:44:08
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

