package com.hansai.springcloud.entity;

import lombok.*;

import java.io.Serializable;

/**
 * <p>Description: </p>
 * <p> </p>
 *
 * @author: hansai
 * @date: 2019/4/16 0016
 * @time: 18:45
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Department implements Serializable{
    private Long deptId;
    private String deptname;
    private Long deptCode;
    private String datasource;


}
