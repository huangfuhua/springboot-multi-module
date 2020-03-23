package com.hfh.springbootmultimodule.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hfh.springbootmultimodule.entity.Product;
import com.hfh.springbootmultimodule.response.Response;
import com.hfh.springbootmultimodule.service.mybatisplus.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by huangfuhua on 2019/4/25.
 */
@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping(path = "/add")
    public Response addPerson(Product product) {
        boolean insert = productService.save(product);
        return Response.builder().data(insert).build();
    }

    @GetMapping(path = "/{id}")
    public Response getPerson(@PathVariable("id") Long id) {
        Product one = productService.getOne(new QueryWrapper<Product>() {
        }.eq("id" , id));
        return Response.builder().data(one).build();
    }

    @GetMapping(path = "/products")
    public Response getPerson(@RequestParam Integer pageNo , @RequestParam Integer pageSize) {
        IPage<Product> productPage = productService.page(new Page<>(pageNo - 1, pageSize), new QueryWrapper<>());
        return Response.builder().data(productPage).build();
    }

    @PutMapping(path = "/update")
    public Response updatePerson(Product product) {
        boolean update = productService.updateById(product);
        return Response.builder().data(update).build();
    }

    @DeleteMapping(path = "/{id}")
    public Response deletePerson(@PathVariable("id") Long id) {
        boolean delete = productService.removeById(id);
        return Response.builder().data(delete).build();
    }
}
