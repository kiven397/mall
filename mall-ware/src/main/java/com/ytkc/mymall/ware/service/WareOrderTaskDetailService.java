package com.ytkc.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytkc.common.utils.PageUtils;
import com.ytkc.mymall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author kky
 * @email 2035963955@qq.com
 * @date 2020-07-18 13:48:20
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

