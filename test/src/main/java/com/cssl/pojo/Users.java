package com.cssl.pojo;

public class Users {

    private Integer id;
    private String name;
    private String sex;


    //master
    public Users() {
        System.out.println("java");
    }

    //dev 构造
    public Users(Integer id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
