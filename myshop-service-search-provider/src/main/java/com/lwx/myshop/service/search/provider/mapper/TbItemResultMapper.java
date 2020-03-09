package com.lwx.myshop.service.search.provider.mapper;

import com.lwx.myshop.service.search.domain.TbItemResult;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Repository
public interface TbItemResultMapper {
    List<TbItemResult> selectAll();
}
