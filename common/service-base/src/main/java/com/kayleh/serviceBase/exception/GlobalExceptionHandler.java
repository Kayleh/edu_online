package com.kayleh.serviceBase.exception;

import com.kayleh.commonutils.result.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 *
 * @Author: Kayleh
 * @Date: 2020/12/28 0:17
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler
{
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e)
    {
        log.error(e.getMessage());
//        log.error(ExceptionUtil.getMessage(e)); 输出到文件
        return R.error();
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R error(ArithmeticException e)
    {
        e.printStackTrace();
        return R.error().message("执行了自定义异常");
    }

    @ExceptionHandler(GuliException.class)
    @ResponseBody
    public R error(GuliException e)
    {
        e.printStackTrace();
        return R.error().message(e.getMsg()).code(e.getCode());
    }
}
