package com.hfh.springbootmultimodule.jpa.repository;

import com.hfh.springbootmultimodule.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by huangfuhua on 2019/4/25.
 */
public interface PersonRepository extends JpaRepository<Person , Long> {
}
