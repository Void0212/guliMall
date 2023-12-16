package com.cxl.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxl.common.utils.PageUtils;
import com.cxl.common.utils.Query;
import com.cxl.gulimall.ware.dao.PurchaseDao;
import com.cxl.gulimall.ware.entity.PurchaseEntity;
import com.cxl.gulimall.ware.service.PurchaseService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("purchaseService")
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, PurchaseEntity> implements PurchaseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseEntity> page = this.page(
                new Query<PurchaseEntity>().getPage(params),
                new QueryWrapper<PurchaseEntity>()
        );

        return new PageUtils(page);
    }

}
