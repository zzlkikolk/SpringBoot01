package com.test.springboot1.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author:智霸霸
 * @Date 2019/10/16
 */
/*
    将配置文件中的每一个属性值，映射到这个组件中
    @ConfigurationProperties(全局配置文件) 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
        prefix = "person" 需要配置的
    @PropertSource 指定yml文件路径
    @ImportResource 导入Spring的配置文件
    组件需要在容器中
 */
@Component
//@PropertySource(value = {"classpath:test.properties"})
@ConfigurationProperties(prefix = "person")
@Validated//数据校验
public class Person {
    /**
     * <bean class="Person">
     *     <property name="lastName" value="xx"/>
     * </bean>
     */
    //@Value("${person.last-name}")
    private String lastName;
    //@Value("#{10*2}")
    private int age;
    private boolean boos;
    private Date birth;
    private Map<String,Object> map;
    private List<Object> list;
    private Dog dog;
    @Email//注入的值必须是一个邮箱
    private String email;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boos=" + boos +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                ", Email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoos() {
        return boos;
    }

    public void setBoos(boolean boos) {
        this.boos = boos;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
