package com.sda.jpa.View.page;

import com.sda.jpa.View.Page;
import com.sda.jpa.dao.DaoFactory;
import com.sda.jpa.dao.DepartmentDao;
import com.sda.jpa.model.Department;
import com.sda.jpa.utils.InputHelper;

/**
 */
public class AddDepartmentPage implements Page {
    @Override
    public void doAction() {
        DepartmentDao dao = (DepartmentDao) DaoFactory.getInstance(DepartmentDao.class);
        System.out.println("Department name: ");
        Department department = new Department(InputHelper.getScanner().nextLine());
        dao.save(department);
        System.out.println("New department successfully added.");
    }
}
