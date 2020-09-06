package com.sda.jpa.View.menu;

import com.sda.jpa.View.Page;
import com.sda.jpa.utils.InputHelper;

import java.util.List;

/**
 */
public abstract class AbstractMenu implements Page {
    abstract List<MenuItem> getItems();

    @Override
    public void doAction() {
        while (true) {
            getItems().forEach((item) -> {
                System.out.println(item.getOption() + " - " + item.getText());
            });
            System.out.println("Your choice: ");
            int choice = InputHelper.getScanner().nextInt();
            InputHelper.getScanner().nextLine();
            MenuItem found = getItems().stream()
                    .filter((op) -> op.getOption() == choice)
                    .findFirst().orElse(null);

            if (found != null) {
                if (found.getOption() == 0 && found.getParent() == null) {
                    System.exit(0);
                } else if (found.getOption() == 0 && found.getParent() != null) {
                    found.getParent().doAction();
                } else {
                    found.getChild().doAction();
                }
            }

        }
    }
}
