/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author BOT
 */
public class Employee {
    private String employee_id;
    private String name;
    private int salary_level_id;
    private String password;
    private int posotion_id;

    public Employee() {
    }

    public Employee(String employee_id, String name, int salary_level_id) {
        this.employee_id = employee_id;
        this.name = name;
        this.salary_level_id = salary_level_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary_level_id() {
        return salary_level_id;
    }

    public void setSalary_level_id(int salary_level_id) {
        this.salary_level_id = salary_level_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPosotion_id() {
        return posotion_id;
    }

    public void setPosotion_id(int posotion_id) {
        this.posotion_id = posotion_id;
    }
    
    
}