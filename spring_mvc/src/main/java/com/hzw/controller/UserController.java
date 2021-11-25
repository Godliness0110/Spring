package com.hzw.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hzw.domain.User;
import com.hzw.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/12 14:57
 * @Description
 */
@Controller
public class UserController {
    @RequestMapping("/quick22")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    public void save22(String username, MultipartFile upload) throws IOException {
        System.out.println(username);
        //获得上传文件名称
        String originalFilename = upload.getOriginalFilename();
        upload.transferTo(new File("F:\\upload\\"+originalFilename));
    }

    @RequestMapping("/quick21")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    public void save21(@CookieValue(value = "JSESSIONID",required = false) String cookies) {
        System.out.println(cookies);
    }

    @RequestMapping("/quick20")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    public void save20(@RequestHeader(value = "User-Agent",required = false) String user_agent) {
        System.out.println(user_agent);
    }

//    @RequestMapping("/quick18")//请求映射，代替以前的<Servlet-Mapping/>
//    @ResponseBody
//    public void save18(Date date) {
//        System.out.println(date);
//    }

    @RequestMapping("/quick17/{name}")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    public void save17(@PathVariable("name") String username) {
        System.out.println(username);
    }

    @RequestMapping("/quick16")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    public void save16(@RequestParam(value = "name",required = false,defaultValue = "hzw") String username) {
        System.out.println(username);
    }

    @RequestMapping("/quick15")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    public void save15(@RequestBody List<User> userList) {
        System.out.println(userList);
    }

    @RequestMapping("/quick14")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    public void save14(VO vo) {
        System.out.println(vo);
    }

    @RequestMapping("/quick13")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    public void save13(String [] strs) {
        System.out.println(strs);
    }

    @RequestMapping("/quick12")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    public void save12(User user) {
        user.setUsername("anli");
        user.setAge(16);
        System.out.println(user);
    }
    @RequestMapping("/quick11")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    public void save11(String username,int age){
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping("/quick10")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody
    //期望SpringMVC自动将User转换为json格式的字符串
    public User save10() throws JsonProcessingException {
        User user = new User();
        user.setUsername("lllllllll");
        user.setAge(17);
        return user;
    }

    @RequestMapping("/quick9")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody//告知SpringMVC框架，不需要跳转，而是直接在Http响应体返回
    public String save9() throws JsonProcessingException {
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(18);
        //使用json的转换工具将对象转换成json格式的字符串再返回
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/quick8")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody//告知SpringMVC框架，返回的字符串不是跳转，而是直接在Http响应体返回
    public String save8(){
        return "{\"username\":\"zhangsan\",\"age\":18}";
    }

    @RequestMapping("/quick7")//请求映射，代替以前的<Servlet-Mapping/>
    @ResponseBody//告知SpringMVC框架，不需要跳转，而是直接在Http响应体返回
    public String save7(){
        return "hezhiwuheanli";
    }

    @RequestMapping("/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("AnLi");
    }

    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request){
        request.setAttribute("username","789123");
        return "success";
    }

    @RequestMapping("/quick4")
    public String save4(Model model){
        model.addAttribute("username","123456");
        return "success";
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView){
        modelAndView.addObject("username","李安利");
//        设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick2")
    public ModelAndView save2(){
        /**
         * Model:模型，作用封装数据
         * View:视图，作用展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username","何智武");
//        设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick")
    public String save(){
        System.out.println("Controller save running...");
        return "success";
    }
}
