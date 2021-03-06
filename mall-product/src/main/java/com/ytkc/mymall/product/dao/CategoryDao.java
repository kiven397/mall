package com.ytkc.mymall.product.dao;

import com.ytkc.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kky
 * @email 2035963955@qq.com
 * @date 2020-07-18 00:12:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
