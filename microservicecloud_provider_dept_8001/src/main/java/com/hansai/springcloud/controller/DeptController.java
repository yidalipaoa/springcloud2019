package com.hansai.springcloud.controller;

import com.hansai.springcloud.entity.Department;
import com.hansai.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>Description: </p>
 * <p> </p>
 *
 * @author: hansai
 * @date: 2019/4/17 0017
 * @time: 16:22
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/dept/get/{id}")
    public Department get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Department> list() {
        return deptService.list();
    }

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Department department) {
        return deptService.add(department);
    }



}
