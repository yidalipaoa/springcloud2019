package com.hansai.springcloud.controller;

import com.hansai.springcloud.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static com.hansai.springcloud.common.constant.Constant.URL_DEPT_PROVIDER;

/**
 * <p>Description: </p>
 * <p> </p>
 *
 * @author: hansai
 * @date: 2019/4/17 0017
 * @time: 16:22
 */
@RestController
public class DeptController_Consumer {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/dept/get/{id}")
    public Department get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL_DEPT_PROVIDER+"/dept/get/"+id,Department.class,"");
    }

    @GetMapping(value = "/dept/list")
    public List<Department> list() {
        return restTemplate.getForObject(URL_DEPT_PROVIDER+"/dept/list",List.class,"");

    }

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Department department) {
        return restTemplate.postForObject(URL_DEPT_PROVIDER+"/dept/add",department,boolean.class);
    }


}
