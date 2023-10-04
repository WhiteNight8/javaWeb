package com.tlias.controller;

import com.tlias.pojo.Dept;
import com.tlias.pojo.Result;
import com.tlias.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@RestController
@Slf4j
@RequestMapping("/depts")
public class DeptController {

//    private static Logger log = LoggerFactory.getLogger(DeptController.class);

    //    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    @Autowired
    private DeptService deptService;


    // query dept data
    @GetMapping
    public Result list() {
        log.info("query all departments data");
       List<Dept> deptList =  deptService.list();
        return Result.success(deptList);
    }

    // delete dept data
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("delelte dept based on id:{}",id);

        deptService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept) {
        log.info("add depts:{}",dept);

        deptService.add(dept);
        return Result.success();
    }
}
