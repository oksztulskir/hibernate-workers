package com.sda.jpa;

import com.sda.jpa.View.menu.MainMenu;

import java.io.IOException;

/**
 */
public class Application {
    public static void main(String[] args) throws IOException {
//        DepartmentDao departmentDao = new DepartmentDao();
//        Department savedDepartment = departmentDao.save(new Department("Department name 2"));
//        System.out.println("Saved department: " + savedDepartment);
//
//        System.out.println("Get by id: " + departmentDao.get(savedDepartment.getDepartmentId()));
//        System.out.println("Get all departments: " + departmentDao.getAll());
//        System.out.println("Find by name: " + departmentDao.findByName("ddepartment na"));
//        long id = 5;
//        System.out.println("Removing entity with id_department=" + id);
//        departmentDao.delete(id);
//        System.out.println("Find element by id=" + id + " : " + departmentDao.get(id));

//        Department department = new Department("New dep2");
//        department.setDepartmentId(3);
//        departmentDao.update(department);

//        Department department = new Department();
//        department.setDepartmentId(5L);
//        Worker worker = new WorkerBuilder()
//                .setFirstName("First")
//                .setLastName("Last")
//                .setAge(30)
//                .setHireDate(LocalDateTime.now())
//                .setDepartment(department)
//                .createWorker();
//        WorkerDao workerDao = new WorkerDao();
//        System.out.println("Added worker: " + workerDao.save(worker));

//        departmentDao.delete(3L);

        MainMenu mainMenu = new MainMenu();
        mainMenu.doAction();
    }
}
