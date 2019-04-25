package com.hfh.springbootmultimodule.service.mybatisplus.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hfh.springbootmultimodule.dao.mybatisplus.ProductDao;
import com.hfh.springbootmultimodule.entity.Product;
import com.hfh.springbootmultimodule.service.mybatisplus.ProductService;
import org.springframework.stereotype.Service;

/**
 * Created by huangfuhua on 2019/4/25.
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductDao , Product> implements ProductService {
}
