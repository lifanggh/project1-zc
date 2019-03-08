package com.zy.login.dao;

import com.zy.login.pojp.Login;

public interface LoginDao {

    Login getLoginByUsername(String lusername);
}
