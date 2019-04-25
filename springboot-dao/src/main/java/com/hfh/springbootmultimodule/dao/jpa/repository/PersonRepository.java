package com.hfh.springbootmultimodule.dao.jpa.repository;

import com.hfh.springbootmultimodule.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by huangfuhua on 2019/4/25.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person , Long> {
}
