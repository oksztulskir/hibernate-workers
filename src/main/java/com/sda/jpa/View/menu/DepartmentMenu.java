package com.sda.jpa.View.menu;

import com.sda.jpa.View.Page;
import com.sda.jpa.View.page.AddDepartmentPage;

import java.util.Arrays;
import java.util.List;

/**
 */
public class DepartmentMenu extends AbstractMenu {

    private final Page mainMenu;

    public DepartmentMenu(Page mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    List<MenuItem> getItems() {
        return Arrays.asList(
            new MenuItem("Add", 1, mainMenu, new AddDepartmentPage()),
                new MenuItem("Delete", 2, mainMenu, null), // TODO: child
            new MenuItem("Update", 3, mainMenu, null), // TODO: child
                new MenuItem("Print workers", 4, mainMenu, null), // TODO:
            new MenuItem("Print departments", 5, mainMenu, null), // TODO
                new MenuItem("Back", 0, mainMenu, null)
        );
    }
}
