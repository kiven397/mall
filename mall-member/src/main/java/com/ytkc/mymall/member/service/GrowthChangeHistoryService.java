package com.ytkc.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytkc.common.utils.PageUtils;
import com.ytkc.mymall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author kky
 * @email 2035963955@qq.com
 * @date 2020-07-18 13:35:36
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

