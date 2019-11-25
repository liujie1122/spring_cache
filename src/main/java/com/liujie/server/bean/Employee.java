package com.liujie.server.bean;

import java.io.Serializable;

/**
 * @program: spring_data_mybatis
 * @description:
 * @author: LiuJie
 * @create: 2019-11-20 13:51
 **/
public class Employee implements Serializable {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer dId;

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getGender() {
        return gender;
    }

    public Integer getdId() {
        return dId;
    }

    public Employee setId(Integer id) {
        this.id = id;
        return this;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public Employee setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    public Employee setdId(Integer dId) {
        this.dId = dId;
        return this;
    }
}
