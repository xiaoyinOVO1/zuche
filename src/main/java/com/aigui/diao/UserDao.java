package com.aigui.diao;

import com.aigui.pojo.User;

public interface UserDao {

    public User findUserByNameAndPsd(String username, String password);
}
