package com.whuaz.bean.demo;

import javax.validation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author grez
 * @since 18-11-17
 **/
public class UserBeanTest {

    public static void main(String[] args) {
        UserBean userBean = getBean();
        try {
            ValidationUtil.validate(userBean);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    private static UserBean getBean() {
        UserBean userBean = new UserBean();
        userBean.setUsername(null);
        userBean.setPassword(null);
        return userBean;
    }
}
