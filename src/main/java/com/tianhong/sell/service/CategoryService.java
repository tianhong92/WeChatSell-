package com.tianhong.sell.service;

import com.tianhong.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by Tianhong on 19/02/2018
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
