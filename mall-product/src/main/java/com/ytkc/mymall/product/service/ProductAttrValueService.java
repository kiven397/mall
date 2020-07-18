package com.ytkc.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytkc.common.utils.PageUtils;
import com.ytkc.mymall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author kky
 * @email 2035963955@qq.com
 * @date 2020-07-17 01:08:09
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

