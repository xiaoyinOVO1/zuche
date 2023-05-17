package com.aigui.impl;

import com.aigui.diao.ShopDao;
import com.aigui.pojo.Shop;
import com.aigui.pojo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserSping implements ShopDao {
    private JdbcTemplate jdbcTemplate;
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Shop>  findshopping(){

        String sql = "select * from db_shop ";
        List<Shop> shop;
        try {
            shop = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Shop>(Shop.class));

        }catch (Exception e){
           shop = null;
        }
        return shop;
    };
}
