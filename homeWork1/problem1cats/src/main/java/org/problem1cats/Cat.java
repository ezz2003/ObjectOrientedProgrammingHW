package org.problem1cats;

public class Cat {
    private String name;
    private int age;
    private Owner owner;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void greet(){
        System.out.printf("Meow! My name is %s. I am %d of the year. My owner is %s.\n", this.name, this.age, owner.getName());
    }
}
