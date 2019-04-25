package com.hfh.springbootmultimodule.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
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
        boolean insert = productService.insert(product);
        return Response.builder().data(insert).build();
    }

    @GetMapping(path = "/{id}")
    public Response getPerson(@PathVariable("id") Long id) {
        Product one = productService.selectOne(new EntityWrapper<Product>().eq("id" , id));
        return Response.builder().data(one).build();
    }

    @GetMapping(path = "/persons")
    public Response getPerson(@RequestParam Integer pageNo , @RequestParam Integer pageSize) {
        Page<Product> productPage = productService.selectPage(new Page<Product>(pageNo - 1, pageSize), new EntityWrapper<Product>());
        return Response.builder().data(productPage).build();
    }

    @PutMapping(path = "/update")
    public Response updatePerson(Product product) {
        boolean update = productService.update(product, new EntityWrapper<Product>().eq("id", product.getId()));
        return Response.builder().data(update).build();
    }

    @DeleteMapping(path = "/{id}")
    public Response deletePerson(@PathVariable("id") Long id) {
        boolean delete = productService.deleteById(id);
        return Response.builder().data(delete).build();
    }
}
