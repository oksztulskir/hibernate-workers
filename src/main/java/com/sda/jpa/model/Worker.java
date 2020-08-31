package com.sda.jpa.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 */
@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long workerId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private LocalDateTime hireDate;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Worker() {
    }

    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    public Worker(String firstName, String lastName, int age, LocalDateTime hireDate, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hireDate = hireDate;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerId=" + workerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hireDate=" + hireDate +
                ", department=" + department +
                '}';
    }



}
