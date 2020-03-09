package com.lwx.myshop.commons.mapper;

import com.lwx.myshop.commons.domain.TbUser;
import com.lwx.myshop.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbUserMapper extends MyMapper<TbUser> {
}