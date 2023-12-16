package com.cxl.gulimall.order.dao;

import com.cxl.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author AtoposVoid
 * @email c1019071457@gmail.com
 * @date 2023-12-16 11:29:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
