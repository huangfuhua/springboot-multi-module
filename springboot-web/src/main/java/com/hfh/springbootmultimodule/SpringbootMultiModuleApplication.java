package com.hfh.springbootmultimodule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.hfh.springbootmultimodule.dao.mybatisplus")
public class SpringbootMultiModuleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMultiModuleApplication.class, args);
	}

}
