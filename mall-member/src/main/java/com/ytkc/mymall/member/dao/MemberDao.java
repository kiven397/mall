package com.ytkc.mymall.member.dao;

import com.ytkc.mymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kky
 * @email 2035963955@qq.com
 * @date 2020-07-18 13:35:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
