package com.sda.jpa.View.menu;

import com.sda.jpa.View.Page;

/**
 */
public class MenuItem {
    private final String text;

    private final int option;

//    private final Consumer<Object> action;

    private final Page parent;

    private final Page child;

    public MenuItem(final String text, final int option, final Page parent, final Page child) {
        this.text = text;
        this.option = option;
        this.parent = parent;
        this.child = child;
    }

    public String getText() {
        return text;
    }

    public int getOption() {
        return option;
    }

    public Page getParent() {
        return parent;
    }

    public Page getChild() {
        return child;
    }
}
