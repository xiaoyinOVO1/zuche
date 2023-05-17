package com.aigui.dao;


import com.aigui.diao.ShopDao;
import com.aigui.diao.UserDao;
import com.aigui.pojo.Shop;
import com.aigui.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class denglu {
    @RequestMapping(value ="/user",method = RequestMethod.POST)
    public String addEmployee(String id, String password, Model model ){

        //执行sql
        User u1=new User();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        u1 = userDao.findUserByNameAndPsd(id,password);

        ShopDao shopdao= (ShopDao) applicationContext.getBean("usershopping");
        List<Shop>  shops =shopdao. findshopping();
        if(u1 != null){
            model.addAttribute("shops",shops);
            return "suesser";
        }else {
//            System.out.println(u1);
            return "erre";
        }

    }
}
