package com.hfh.springbootmultimodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@MapperScan(basePackages = {"com.hfh.springbootmultimodule.dao"})
//@ComponentScan(basePackages = {"com.hfh.springbootmultimodule"})
public class SpringbootMultiModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMultiModuleApplication.class, args);
	}

}
