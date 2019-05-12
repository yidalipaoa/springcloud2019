package com.hansai.springcloud.service;

import com.hansai.springcloud.entity.Department;

import java.util.List;

/**
 * <p>Description: </p>
 * <p> </p>
 *
 * @author: hansai
 * @date: 2019/4/17 0017
 * @time: 16:10
 */

public interface DeptService {

    public Department get(Long id);
    public List<Department> list();
    public boolean add(Department department);
}
