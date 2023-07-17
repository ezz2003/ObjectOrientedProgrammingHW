package org.problem1cats;

//Создайте класс "Кот" (Cat) со следующими свойствами:
//        Приватное поле "имя" (name) типа String для хранения имени кота.
//        Приватное поле "возраст" (age) типа int для хранения возраста кота.
//        Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
//        Публичный метод "приветствие" (greet), который выводит на консоль
//        приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
//        Дополнительное задание:
//        Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String.
//        Добавьте соответствующее поле в классе "Кот" и методы доступа для него.
//        Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие
//        вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat myCat1 = new Cat("Mursic", 5);
        Cat myCat2 = new Cat("Vaska", 7);
        Owner myOwner1 = new Owner("Ivan");
        myOwner1.setCats(new LinkedList<>(List.of()));
        myCat1.setOwner(myOwner1);
        myCat2.setOwner(myOwner1);
        myOwner1.addCat(myCat1);
        myOwner1.addCat(myCat2);
        myCat1.greet();
        myCat2.greet();
        System.out.printf("My name is %s. %s", myOwner1.getName(), myOwner1.getCats());
    }
}