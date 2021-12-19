package com.spring.product.dao;

import com.spring.product.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface ProductDao {
    Product GetProduct(int id);

    Product DecreaseProduct(int id,int quantity);
}
