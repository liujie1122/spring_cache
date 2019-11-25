package com.liujie.server.mapper;

import com.liujie.server.bean.Department;
import com.liujie.server.bean.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @program: spring_data_mybatis
 * @description:
 * @author: LiuJie
 * @create: 2019-11-20 14:04
 **/
//指定这是一个用于操作数据库的mapper
//@Mapper
public interface EmployeeMapper {
    @Options(useGeneratedKeys=true,keyProperty="id")
    @Insert("INSERT INTO employee(lastName,email,gender,d_id) VALUES (#{lastName},#{email},#{gender},#{dId})")
    public int insert(Employee employee);

    @Delete("DELETE FROM employee WHERE id=#{id}")
    public int deleteById(int id);

    @Update("UPDATE employee SET lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} WHERE id=#{id}")
    public int update(Employee employee);

    @Select("SELECT * FROM employee WHERE id=#{id}")
    public Employee selectById(int id);

    @Select("SELECT * FROM employee WHERE lastName=#{name}")
    Employee getEmpByName(String name);
}
