package com.hfh.springbootmultimodule.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by huangfuhua on 2019/4/25.
 */
@Entity
@Data
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = true, length = 128)
    private String name;

    @Column(name = "age", nullable = true, length = 4)
    private Integer age;
}
