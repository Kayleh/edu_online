package com.kayleh.serviceEdu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kayleh.serviceEdu.entity.EduSubject;
import com.kayleh.serviceEdu.subject.OneSubject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author kayleh
 * @since 2020-12-30
 */
public interface EduSubjectService extends IService<EduSubject>
{
    //添加课程分类
    void saveSubject(MultipartFile file, EduSubjectService eduSubjectService);

    //课程分类列表功能
    List<OneSubject> getAllOneTwoSubject();
}
