package com.lwx.myshop.service.search.api;

import com.lwx.myshop.service.search.domain.TbItemResult;

import java.util.List;

/**
 * @author Administrator
 */
public interface SearchService {

    List<TbItemResult> search(String query, int page, int rows);
}
