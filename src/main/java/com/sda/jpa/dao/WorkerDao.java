package com.sda.jpa.dao;

import com.sda.jpa.model.Department;
import com.sda.jpa.model.Worker;
import com.sda.jpa.utils.JpaHelper;

import java.util.List;

/**
 */
public class WorkerDao implements GenericDao<Worker> {
    @Override
    public Worker get(long id) {
        return null;
    }

    @Override
    public List<Worker> getAll() {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Worker save(Worker entity) {
        JpaHelper.doInTransaction((entityManager -> {
            Department department = entityManager.find(Department.class, entity.getDepartment().getDepartmentId());
            entity.setDepartment(department);
            entityManager.persist(entity);
        }));

        return entity;
    }

    @Override
    public void update(Worker entity) {

    }
}
