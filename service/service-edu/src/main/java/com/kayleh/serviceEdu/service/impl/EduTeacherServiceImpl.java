package com.kayleh.serviceEdu.service.impl;

import com.alibaba.excel.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kayleh.serviceEdu.entity.EduTeacher;
import com.kayleh.serviceEdu.entity.query.TeacherQuery;
import com.kayleh.serviceEdu.mapper.EduTeacherMapper;
import com.kayleh.serviceEdu.service.EduTeacherService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 讲师 服务实现类
 * </p>
 *
 * @author kayleh
 * @since 2020-12-27
 */
@Service
public class EduTeacherServiceImpl extends ServiceImpl<EduTeacherMapper, EduTeacher> implements EduTeacherService
{

    @Override
    public void pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery)
    {
        QueryWrapper<EduTeacher> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("sort");
        if (teacherQuery == null)
        {
            baseMapper.selectPage(pageParam, queryWrapper);
            return;
        }
        String name = teacherQuery.getName();
        String level = teacherQuery.getLevel();
        String begin = teacherQuery.getBegin();
        String end = teacherQuery.getEnd();
        if (!StringUtils.isEmpty(name))
        {
            queryWrapper.like("name", name);
        }
        if (!StringUtils.isEmpty(level))
        {
            queryWrapper.like("level", level);
        }
        if (!StringUtils.isEmpty(begin))
        {
            queryWrapper.like("begin", begin);
        }
        if (!StringUtils.isEmpty(end))
        {
            queryWrapper.like("end", end);
        }
        baseMapper.selectPage(pageParam, queryWrapper);
    }
}
