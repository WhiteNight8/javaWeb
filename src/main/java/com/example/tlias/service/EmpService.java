package com.example.tlias.service;

import com.example.tlias.pojo.PageBean;

/**
 * 员工管理
 */
public interface EmpService {

    PageBean page(Integer page, Integer pageSize);
}
