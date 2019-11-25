package com.liujie.server.controller;

import com.liujie.server.bean.Employee;
import com.liujie.server.mapper.EmployeeMapper;
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
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getById/{id}")
    public Employee getById(@PathVariable Integer id){
        return employeeService.getById(id);
    }

    @GetMapping("/addEmp")
    public Employee addEmp(){
        Employee employee = employeeService.addEmp(null);
        return employee;
    }


    @GetMapping("/updateEmp")
    public Employee updateEmp(Employee employee){
        return employeeService.updateEmp(employee);
    }

    @GetMapping("/deleteEmp/{id}")
    public int deleteEmp(@PathVariable Integer id){
        return employeeService.deleteEmp(id);
    }

    @GetMapping("/getEmpByName/{name}")
    public Employee getEmpByName(@PathVariable String name){
        return employeeService.getEmpByName(name);
    }

}
