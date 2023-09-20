package com.example.tlias.mapper;

import com.example.tlias.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理
 */
@Mapper
public interface EmpMapper {

//    @Select("select * from emp")
    void delete(List<Integer> ids);
public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
}
