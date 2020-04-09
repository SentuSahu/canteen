package com.hungry.online.sweets;

public class Information {
    private  String Name;
    private  Integer Age;
    private Long ph;

    public Information() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Long getPh() {
        return ph;
    }

    public void setPh(Long ph) {
        this.ph = ph;
    }
}
