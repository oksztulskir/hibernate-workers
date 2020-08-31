package com.sda.jpa.model;

import javax.persistence.*;
import java.util.List;

/**
 */
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long departmentId;

    @Column(nullable = false)
    private String name;

    @OneToMany(
            mappedBy = "department",
            cascade = CascadeType.REMOVE,
            orphanRemoval = true)
    private List<Worker> workers;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", name='" + name + '\'' +
                '}';
    }


}
