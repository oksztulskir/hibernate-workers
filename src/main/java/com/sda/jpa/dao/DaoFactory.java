package com.sda.jpa.dao;

/**
 */
public class DaoFactory {
    private static DepartmentDao departmentDao;

    private static WorkerDao workerDao;

    private DaoFactory() {
        // NOP
    }

    public static GenericDao getInstance(Class clazz) {
        if (clazz.equals(DepartmentDao.class)) {
            if (departmentDao == null) {
                departmentDao = new DepartmentDao();
            }

            return departmentDao;
        } else if (clazz.equals(WorkerDao.class)) {
            if (workerDao == null) {
                workerDao = new WorkerDao();
            }

            return workerDao;
        }

        throw new IllegalArgumentException("Unsupported DAO type!");
    }
}
