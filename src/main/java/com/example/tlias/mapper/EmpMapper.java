package com.example.tlias.mapper;

import com.example.tlias.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 员工管理
 */
@Mapper
public interface EmpMapper {

    @Select("select count(*) from emp")
    public Long count();

    @Select("select * from emp limit #{start}, #{pageSize}")
    public List<Emp> list(Integer start,Integer pageSize);
}
