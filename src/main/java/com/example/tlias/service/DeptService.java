package com.example.tlias.service;

import com.example.tlias.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */

public interface DeptService {
    List<Dept> list();

    // delete dept
    void delete(Integer id);

    void add(Dept dept);
}
