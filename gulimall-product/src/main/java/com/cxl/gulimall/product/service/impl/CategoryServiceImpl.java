package com.cxl.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxl.common.utils.PageUtils;
import com.cxl.common.utils.Query;
import com.cxl.gulimall.product.dao.CategoryDao;
import com.cxl.gulimall.product.entity.CategoryEntity;
import com.cxl.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

}
