package com.example.tlias.controller;

import com.example.tlias.pojo.Dept;
import com.example.tlias.pojo.Result;
import com.example.tlias.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@RestController
@Slf4j
public class DeptController {

//    private static Logger log = LoggerFactory.getLogger(DeptController.class);

    //    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    @Autowired
    private DeptService deptService;


    // query dept data
    @GetMapping("/depts")
    public Result list() {
        log.info("query all departments data");
       List<Dept> deptList =  deptService.list();
        return Result.success(deptList);
    }

    // delete dept data
    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("delelte dept based on id:{}",id);

        deptService.delete(id);
        return Result.success();
    }
}
