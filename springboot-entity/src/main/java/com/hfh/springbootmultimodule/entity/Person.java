package com.hfh.springbootmultimodule.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by huangfuhua on 2019/4/25.
 */
@Entity
@Table(name = "person")
@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = true, length = 128)
    private String name;

    @Column(name = "age", nullable = true, length = 4)
    private Integer age;
}
