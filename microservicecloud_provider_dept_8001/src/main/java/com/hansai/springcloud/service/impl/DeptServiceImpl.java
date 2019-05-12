package com.hansai.springcloud.service.impl;

import com.hansai.springcloud.entity.Department;
import com.hansai.springcloud.mapper.DeptMapper;
import com.hansai.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Description: </p>
 * <p> </p>
 *
 * @author: hansai
 * @date: 2019/4/17 0017
 * @time: 16:15
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Department get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List list() {
        return deptMapper.findAll();
    }

    @Override
    public boolean add(Department department) {
        return deptMapper.addDept(department);
    }

}
