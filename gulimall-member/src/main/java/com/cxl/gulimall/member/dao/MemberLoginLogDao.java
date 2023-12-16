package com.cxl.gulimall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cxl.gulimall.member.entity.MemberLoginLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 *
 * @author AtoposVoid
 * @email c1019071457@gmail.com
 * @date 2023-12-16 11:22:03
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {

}
