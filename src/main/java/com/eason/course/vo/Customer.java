package com.eason.course.vo;

import com.bstek.urule.model.Label;

public class Customer {

    @Label("名称")
    private String name;
    @Label("年龄")
    private int age;
    @Label("手机号")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
