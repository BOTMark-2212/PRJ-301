/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author BOT
 */
public class TimeSheet {
    private String employee_name;
    private String employee_id;
    private int salary_level_id;
    private Date date;
    private int shift_id;
    private int working_status_id;

    public TimeSheet() {
    }

    public TimeSheet(String employee_name, String employee_id, int salary_level_id, Date date, int shift_id, int working_status_id) {
        this.employee_name = employee_name;
        this.employee_id = employee_id;
        this.salary_level_id = salary_level_id;
        this.date = date;
        this.shift_id = shift_id;
        this.working_status_id = working_status_id;
    }

    public int getSalary_level_id() {
        return salary_level_id;
    }

    public void setSalary_level_id(int salary_level_id) {
        this.salary_level_id = salary_level_id;
    }

    
    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getShift_id() {
        return shift_id;
    }

    public void setShift_id(int shift_id) {
        this.shift_id = shift_id;
    }

    public int getWorking_status_id() {
        return working_status_id;
    }

    public void setWorking_status_id(int working_status_id) {
        this.working_status_id = working_status_id;
    }

    @Override
    public String toString() {
        return "TimeSheet{" + "employee_name=" + employee_name + ", employee_id=" + employee_id + ", salary_level_id=" + salary_level_id + ", date=" + date + ", shift_id=" + shift_id + ", working_status_id=" + working_status_id + '}';
    }

    
    
}
