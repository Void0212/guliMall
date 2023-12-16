package com.cxl.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cxl.common.utils.PageUtils;
import com.cxl.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author AtoposVoid
 * @email c1019071457@gmail.com
 * @date 2023-12-16 11:29:24
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

