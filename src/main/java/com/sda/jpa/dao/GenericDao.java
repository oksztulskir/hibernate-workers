package com.sda.jpa.dao;

import java.util.List;

/**
 * Generic interface for DAO classes making CRUD operations for entities.
 */
public interface GenericDao<T> {
    /**
     * Returns entity for a given id.
     * @param id entity identifier
     * @return entity
     */
    T get(long id);

    /**
     *
     * @return
     */
    List<T> getAll();

    /**
     *
     * @param id
     */
    void delete(long id);

    T save(T entity);

    void update(T entity);
}
