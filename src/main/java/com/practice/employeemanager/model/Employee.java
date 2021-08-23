package com.practice.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    @Column( nullable = false, updatable = false )
    private Long id;
    private String name;
    private String email;
    private String job_title;
    private String phone_number;
    private String image_url;
    @Column( nullable = false, updatable = false )
    private String employee_code;

    public Employee() {
    }

    public Employee(String name, String email, String job_title, String phone_number, String image_url, String employee_code) {
        this.name = name;
        this.email = email;
        this.job_title = job_title;
        this.phone_number = phone_number;
        this.image_url = image_url;
        this.employee_code = employee_code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getEmployee_code() {
        return employee_code;
    }

    public void setEmployee_code(String employee_code) {
        this.employee_code = employee_code;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", job_title='" + job_title + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", image_url='" + image_url + '\'' +
                ", employee_code='" + employee_code + '\'' +
                '}';
    }
}
