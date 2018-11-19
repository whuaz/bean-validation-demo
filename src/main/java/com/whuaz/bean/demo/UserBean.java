package com.whuaz.bean.demo;

import javax.validation.constraints.*;

/**
 * @author grez
 * @since 18-11-17
 **/
public class UserBean {

    @NotNull(message = "用户名不能为空")
    private String username;

    @NotNull(message = "密码不能为空")
    private String password;

    /**
     * 必须是一个数字，字段值必须小于等于指定最大值
     */
    @Max(value = 200, message = "")
    private Integer age;

    /**
     * 必须是一个数字，字段值必须大于等于指定最小值
     */
    @Min(value = 1, message = "")
    private Integer count;

    /**
     * 指定范围内
     */
    @Size(max = 200, min = 1)
    private Integer range;

    /**
     * 符合指定正则表达式
     * @return
     */
    @Pattern(regexp = "")
    private String str;

    /**
     *
     */
    @DecimalMin(value = "0.1", message = "最低为0.1")
    private Double price;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", count=" + count +
                ", range=" + range +
                ", str='" + str + '\'' +
                ", price=" + price +
                '}';
    }
}
