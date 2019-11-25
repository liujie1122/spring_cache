package com.liujie.server.controller;

import com.liujie.server.bean.Department;
import com.liujie.server.bean.Employee;
import com.liujie.server.service.DepartmentService;
import com.liujie.server.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring_cache
 * @description:
 * @author: LiuJie
 * @create: 2019-11-21 11:20
 **/
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/getById/{id}")
    public Department getById(@PathVariable Integer id){
        return departmentService.getById(id);
    }
}
