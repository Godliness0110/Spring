package com.hzw.converter;

import org.springframework.cglib.core.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Godliness
 * @date 2021/10/12 21:19
 * @Description
 */
//public class DateConverter implements Converter{
//    public Date convert(String dateStr) {
//            //将日期字符串准换为日期对象，返回
//            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//            Date date = null;
//            try {
//                date = format.parse(dateStr);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//            return date;
//        }
//
//    @Override
//    public Object convert(Object o, Class aClass, Object o1) {
//        return null;
//    }
//}
