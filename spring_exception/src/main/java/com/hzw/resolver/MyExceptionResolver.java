package com.hzw.resolver;

import com.hzw.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Godliness
 * @date 2021/10/14 21:04
 * @Description
 */
public class MyExceptionResolver implements HandlerExceptionResolver {
    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     * 参数Exception：异常对象
     * 返回值ModelAndView：跳转错误视图信息
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e){
        ModelAndView modelAndView = new ModelAndView();
        if(e instanceof ClassCastException){
            modelAndView.addObject("info","类型转换异常");
        }

        modelAndView.setViewName("error");
        return modelAndView;
    }
}
