package com.ytkc.mymall.order.dao;

import com.ytkc.mymall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author kky
 * @email 2035963955@qq.com
 * @date 2020-07-18 13:41:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
