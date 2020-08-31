package com.sda.jpa.dao;

import com.sda.jpa.model.Department;
import com.sda.jpa.utils.JpaHelper;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

/**
 */
public class DepartmentDao implements GenericDao<Department> {
    @Override
    public Department get(long id) {
        try {
            // select  * from department where department_id = {id}
//        return JpaHelper.getEntityManager().find(Department.class, id);
            Query query = JpaHelper.getEntityManager().createQuery("select d from Department d " +
                    "where d.departmentId = :idParam");
            query.setParameter("idParam", id);

            return (Department) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Department> getAll() {
        Query query = JpaHelper.getEntityManager().createQuery("select d from Department d");

        return query.getResultList();
    }

    @Override
    public void delete(long id) {
        JpaHelper.doInTransaction((entityManager -> {
            Department entity = this.get(id);
            entity.getWorkers().clear();
            entityManager.remove(entity);
        }));
    }

    @Override
    public Department save(Department entity) {
        JpaHelper.doInTransaction((entityManager) -> {
            entityManager.persist(entity);
        });

        return entity;
    }

    @Override
    public void update(Department entity) {
        JpaHelper.doInTransaction((entityManager) -> {
            entityManager.merge(entity);
        });
    }

    public List<Department> findByName(String name) {
        Query query = JpaHelper.getEntityManager().createQuery("select d from Department d " +
                "where d.name like :name");
        query.setParameter("name", "%" + name + "%");

        return query.getResultList();
    }
}
