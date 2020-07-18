package com.ytkc.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytkc.common.utils.PageUtils;
import com.ytkc.mymall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author kky
 * @email 2035963955@qq.com
 * @date 2020-07-18 13:35:35
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

