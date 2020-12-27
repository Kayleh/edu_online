package com.kayleh.serviceEdu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Kayleh
 * @Date: 2020/12/27 16:03
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.kayleh"})
public class EduApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(EduApplication.class, args);
    }
}
