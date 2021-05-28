package com.test.pluto;

public class Emp {
    private int id;
    private String name;
    private String salary;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    private String des;

    public Emp() {
    }

    public Emp(int id, String name, String salary, String des) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}
