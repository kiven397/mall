package com.ytkc.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytkc.common.utils.PageUtils;
import com.ytkc.mymall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author kky
 * @email 2035963955@qq.com
 * @date 2020-07-18 00:12:45
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

