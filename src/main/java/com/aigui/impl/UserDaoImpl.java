package com.aigui.impl;

import com.aigui.diao.UserDao;
import com.aigui.pojo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    public User findUserByNameAndPsd(String username, String password) {

        String sql = "select * from db_user where username=? and password=?";

        User user = null;

        try {
            user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);

        }catch (Exception e){
            user = null;
        }
        return user;
    }
}