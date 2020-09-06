package com.sda.jpa.View.menu;

import java.util.Arrays;
import java.util.List;

/**
 */
public class MainMenu extends AbstractMenu {
    @Override
    List<MenuItem> getItems() {
        return Arrays.asList(
                new MenuItem("Departments", 1, null, new DepartmentMenu(this)),
                new MenuItem("Workers", 2, null, null),
                new MenuItem("Exit", 0, null, null)
        );
    }
}
