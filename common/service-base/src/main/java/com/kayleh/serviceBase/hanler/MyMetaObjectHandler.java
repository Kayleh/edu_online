package com.kayleh.serviceBase.hanler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: Kayleh
 * @Date: 2020/12/27 23:06
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler
{

    @Override
    public void insertFill(MetaObject metaObject)
    {
        this.setFieldValByName("gmtCreate", new Date(), metaObject);
        this.setFieldValByName("gmtModified", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject)
    {
        this.setFieldValByName("gmtModified", new Date(), metaObject);
    }
}
