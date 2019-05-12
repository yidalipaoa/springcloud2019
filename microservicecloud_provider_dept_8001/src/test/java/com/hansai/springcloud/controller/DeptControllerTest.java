package com.hansai.springcloud.controller;

import com.hansai.springcloud.common.util.FastJsonUtil;
import com.hansai.springcloud.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptControllerTest {
    @Autowired
    private DeptService deptService;

    @Test
    public void get() throws Exception {

    }

    @Test
    public void list() throws Exception {
        System.out.println(FastJsonUtil.objectToJSON(deptService.list()));
    }

    @Test
    public void add() throws Exception {
    }

}