package com.liujie.server.mapper;

import com.liujie.server.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @program: spring_data_mybatis
 * @description:
 * @author: LiuJie
 * @create: 2019-11-20 14:04
 **/
//指定这是一个用于操作数据库的mapper
//@Mapper
public interface DepartmentMapper {
    @Options(useGeneratedKeys=true,keyProperty="id")
    @Insert("insert into department (department_name) values (#{departmentName})")
    public int insert(Department department);

    @Delete("delete from department where id=#{id}")
    public int deleteById(int id);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int update(Department department);

    @Select("select * from department where id=#{id}")
    public Department selectById(int id);
}
