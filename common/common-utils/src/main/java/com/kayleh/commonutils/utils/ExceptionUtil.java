package com.kayleh.commonutils.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Author: Kayleh
 * @Date: 2020/12/28 1:20
 */
public class ExceptionUtil
{
    public static String getMessage(Exception e)
    {
        StringWriter sw = null;
        PrintWriter pw = null;
        try
        {
            sw = new StringWriter();
            pw = new PrintWriter(sw);
            //将出错的栈信息输出到printWriter中
            e.printStackTrace(pw);
            pw.flush();
            sw.flush();
        } finally
        {
            if (sw != null)
            {
                try
                {
                    sw.close();
                } catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
            }

            if (pw != null)
            {
                pw.close();
            }
        }
        return sw.toString();
    }
}
