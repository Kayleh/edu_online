package com.kayleh.serviceEdu.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kayleh.serviceEdu.entity.EduTeacher;
import com.kayleh.serviceEdu.entity.query.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author kayleh
 * @since 2020-12-27
 */
public interface EduTeacherService extends IService<EduTeacher>
{
    void pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery);
}
