package com.demo.bean;

/* @Desc: bean
 * @author:zhengs  
 * @Time: 2019/8/12 10:32
 * @Copyright: © zhengs 版权所有  
 */
public class HelloBean {
    private String name;

    private Integer age;

    public HelloBean(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
