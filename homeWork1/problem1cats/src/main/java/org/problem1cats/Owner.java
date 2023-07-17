package org.problem1cats;

import java.util.LinkedList;

public class Owner {
    private String name;
    private LinkedList<Cat> cats;

    Owner(String name, LinkedList<Cat> cats) {
        this.name = name;
        this.cats = cats;
    }

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCats(LinkedList<Cat> cats) {
        this.cats = cats;
    }

    public void addCat(Cat cat) {
        this.cats.add(cat);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCats() {
        String s = "";
        for (Cat cat: this.cats){
            s += cat.getName() + ", ";
        }
        return String.format(" I have %s cats: %s", this.cats.size(), s.substring(0, s.length() - 2));
    }
}
