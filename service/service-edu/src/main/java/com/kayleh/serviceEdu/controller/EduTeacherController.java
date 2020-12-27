package com.kayleh.serviceEdu.controller;


import com.kayleh.serviceEdu.entity.EduTeacher;
import com.kayleh.serviceEdu.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author kayleh
 * @since 2020-12-27
 */
@CrossOrigin//跨域
@RestController
@RequestMapping("/serviceEdu/edu-teacher")
public class EduTeacherController
{
    @Autowired
    private EduTeacherService teacherService;

    @GetMapping
    public List<EduTeacher> list()
    {
        return teacherService.list(null);
    }

    @DeleteMapping("{id}")
    public boolean removeById(@PathVariable String id)
    {
        return teacherService.removeById(id);
    }

}

