package com.kayleh.serviceEdu.entity.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Author: Kayleh
 * @Date: 2020/12/29 19:34
 */
@Data
public class ExcelSubjectData
{
    @ExcelProperty(index = 0)
    private int oneSubjectName;

    @ExcelProperty(index = 1)
    private String twoSubjectName;

}
