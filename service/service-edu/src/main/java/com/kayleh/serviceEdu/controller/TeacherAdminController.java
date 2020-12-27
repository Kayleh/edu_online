package com.kayleh.serviceEdu.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kayleh.commonutils.R;
import com.kayleh.serviceEdu.entity.EduTeacher;
import com.kayleh.serviceEdu.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Kayleh
 * @Date: 2020/12/27 17:37
 */
@Api(description = "讲师管理")
@RestController
@RequestMapping("/admin/edu/teacher")
public class TeacherAdminController
{
    @Autowired
    private EduTeacherService teacherService;

    @ApiOperation(value = "所有讲师列表")
    @GetMapping
    public R list()
    {
        List<EduTeacher> teacherList = teacherService.list(null);
        return R.ok().data("items", teacherList);
    }

    @ApiOperation(value = "根据id删除讲师")
    @DeleteMapping("{id}")
    public R removeById(
            @ApiParam(name = "id", value = "讲师id", required = true)
            @PathVariable String id)
    {
        teacherService.removeById(id);
        return R.ok();
    }

    @ApiOperation(value = "分页讲师列表")
    @GetMapping("{page}/{limit}")
    public R pageList(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit
    )
    {
        Page<EduTeacher> pageParam = new Page<>(page, limit);
        teacherService.page(pageParam, null);
        List<EduTeacher> teacherList = pageParam.getRecords();
        long total = pageParam.getTotal();
        return R.ok().data("total", total).data("row", teacherList);
    }

    @ApiOperation(value = "新增讲师")
    @PostMapping
    public R save(
            @ApiParam(name = "teacher", value = "讲师对象", required = true)
            @RequestBody EduTeacher teacher)
    {
        teacherService.save(teacher);
        return R.ok();
    }


}
