package com.zy.login.service.impl;

import com.zy.login.dao.LoginDao;
import com.zy.login.pojp.Login;
import com.zy.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao dao;


    @Override
    public Map<String, Object> login(HttpSession session, Login login) {
      Map<String ,Object> map= new HashMap<>();
      //查询用户
    Login user=dao.getLoginByUsername(login.getLusername());
       if (user!=null){
          if (user.getLpassword().equals(login.getLpassword())){
            session.setAttribute("user",login);
            map.put("success",true);
            map.put("msg","登录成功!");
          }else {
              map.put("success",false);
              map.put("msg","密码错误");
          }
       }else{
           map.put("success",false);
           map.put("msg","用户不存在");
       }



        return map;
    }
}
