package com.tlias.mapper;

import com.tlias.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

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
