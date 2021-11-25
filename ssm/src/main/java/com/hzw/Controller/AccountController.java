package com.hzw.Controller;

import com.hzw.domain.Account;
import com.hzw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/18 20:10
 * @Description
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    //保存
    @RequestMapping(value = "/save",produces = "text/html;charset=utf-8")
    @ResponseBody//代表字符串直接展示
    public String save(Account account){
        accountService.save(account);
        return "恭喜你保存成功";
    }


    //查询
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName("accountList");
        return modelAndView;
    }
}
