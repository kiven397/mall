package com.ytkc.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytkc.common.utils.PageUtils;
import com.ytkc.mymall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author kky
 * @email 2035963955@qq.com
 * @date 2020-07-18 13:41:51
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

