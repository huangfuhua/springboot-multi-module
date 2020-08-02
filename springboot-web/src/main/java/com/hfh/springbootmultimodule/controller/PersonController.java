package com.hfh.springbootmultimodule.controller;

import com.hfh.springbootmultimodule.dao.jpa.repository.PersonRepository;
import com.hfh.springbootmultimodule.entity.Person;
import com.hfh.springbootmultimodule.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * Created by huangfuhua on 2019/4/25.
 */
@RestController
@RequestMapping(value = "person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping(path = "/add")
    public Response addPerson(Person person) {
        Person result = personRepository.save(person);
        return Response.builder().data(result).build();
    }

    @GetMapping(path = "/{id}")
    public Response getPerson(@PathVariable("id") Long id) {
        Person one = personRepository.getOne(id);
        return Response.builder().data(one).build();
    }

    @GetMapping(path = "/persons")
    public Response getPerson(@RequestParam Integer pageNo , @RequestParam Integer pageSize) {
        Pageable pageable = new PageRequest(pageNo-1, pageSize);
        Page<Person> all = personRepository.findAll(pageable);
        return Response.builder().data(all).build();
    }

    @PutMapping(path = "/update")
    public Response updatePerson(Person person) {
        Person result = personRepository.save(person);
        return Response.builder().data(result).build();
    }

    @DeleteMapping(path = "/{id}")
    public Response deletePerson(@PathVariable("id") Long id) {
        personRepository.deleteById(id);
        return Response.builder().build();
    }
}
