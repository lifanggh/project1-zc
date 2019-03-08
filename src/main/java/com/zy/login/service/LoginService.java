package com.zy.login.service;

import com.zy.login.pojp.Login;

import javax.servlet.http.HttpSession;
import java.util.Map;

public interface LoginService {


    Map<String,Object> login(HttpSession session, Login login);
}
