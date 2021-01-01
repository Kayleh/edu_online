package com.kayleh.serviceEdu.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: Kayleh
 * @Date: 2020/12/29 19:38
 */
public interface SubjectService
{
    void batchImport(MultipartFile file);

    void importSubjectData(MultipartFile file, SubjectService subjectService);
}
