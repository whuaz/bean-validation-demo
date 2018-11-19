#### 非web项目java bean校验

##### 依赖：
```
<dependency>
    <groupId>javax.validation</groupId>
    <artifactId>validation-api</artifactId>
    <version>1.1.0.Final</version>
</dependency>
<!-- hibernate validator-->
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-validator</artifactId>
    <version>5.3.6.Final</version>
</dependency>

<dependency>
    <groupId>javax.el</groupId>
    <artifactId>javax.el-api</artifactId>
    <version>2.2.4</version>
</dependency>
<dependency>
    <groupId>org.glassfish.web</groupId>
    <artifactId>javax.el</artifactId>
    <version>2.2.4</version>
</dependency>
```

##### 测试:
```
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
```
