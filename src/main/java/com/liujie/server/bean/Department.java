package com.liujie.server.bean;

import java.io.Serializable;

/**
 * @program: spring_data_mybatis
 * @description:
 * @author: LiuJie
 * @create: 2019-11-20 13:48
 **/
public class Department implements Serializable {
    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
