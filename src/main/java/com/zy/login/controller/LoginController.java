package com.zy.login.controller;

import com.zy.login.pojp.Login;
import com.zy.login.service.LoginService;
import com.zy.util.YzmUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@Controller
public class LoginController {

	
//获得验证码
@Autowired
private LoginService service;


    //获得验证码
    @RequestMapping("/login/yzm")
    public void getYzm(HttpServletRequest request , HttpServletResponse response) {
        try {
            YzmUtil.CreateYZM(request, response);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
    //获取域中的验证码
    @RequestMapping("/login/getYzm")
    @ResponseBody
    public Map<String,Object> getYzm(HttpSession session){
        Map<String,Object> map = new HashMap<>();
        map.put("yzm", session.getAttribute("yzm"));
        return map;
    }
     @RequestMapping("/login/login")
     @ResponseBody
     public Map<String,Object> login(HttpSession session,Login login){
         Map<String,Object> map = new HashMap<>();
         try {
             map = service.login(session,login);
         } catch (Exception e) {
             e.printStackTrace();
             map.put("success", false);
             map.put("msg", "系统异常!");
         }
         return map;
     }
   @RequestMapping("/toIndex")
    public String toindex(){
         return "index";
    }


}
