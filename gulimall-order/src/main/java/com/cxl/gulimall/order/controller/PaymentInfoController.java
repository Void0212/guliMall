package com.cxl.gulimall.order.controller;

import com.cxl.common.utils.PageUtils;
import com.cxl.common.utils.R;
import com.cxl.gulimall.order.entity.PaymentInfoEntity;
import com.cxl.gulimall.order.service.PaymentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 支付信息表
 *
 * @author AtoposVoid
 * @email c1019071457@gmail.com
 * @date 2023-12-16 11:29:24
 */
@RestController
@RequestMapping("order/paymentinfo")
public class PaymentInfoController {
    @Autowired
    private PaymentInfoService paymentInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:paymentinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = paymentInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:paymentinfo:info")
    public R info(@PathVariable("id") Long id){
		PaymentInfoEntity paymentInfo = paymentInfoService.getById(id);

        return R.ok().put("paymentInfo", paymentInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:paymentinfo:save")
    public R save(@RequestBody PaymentInfoEntity paymentInfo){
		paymentInfoService.save(paymentInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:paymentinfo:update")
    public R update(@RequestBody PaymentInfoEntity paymentInfo){
		paymentInfoService.updateById(paymentInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:paymentinfo:delete")
    public R delete(@RequestBody Long[] ids){
		paymentInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
