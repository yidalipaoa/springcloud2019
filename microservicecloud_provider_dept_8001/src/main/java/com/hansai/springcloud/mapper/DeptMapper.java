package com.hansai.springcloud.mapper;

import com.hansai.springcloud.entity.Department;

import java.util.List;

/**
 * <p>Description: </p>
 * <p> </p>
 *
 * @author: hansai
 * @date: 2019/4/17 0017
 * @time: 15:53
 */
public interface DeptMapper {
    public Department findById(Long id);
    public List<Department> findAll();
    public boolean addDept(Department department);
}
