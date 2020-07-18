package com.ytkc.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytkc.common.utils.PageUtils;
import com.ytkc.mymall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author kky
 * @email 2035963955@qq.com
 * @date 2020-07-17 01:08:09
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

