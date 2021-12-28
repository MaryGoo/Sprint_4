package ru.praktikum_qa.bank_card;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null) {
            return false;
        }
    return name.matches("(?=.{3,18}$)[a-zA-Zа-яёА-яЁ]+\\s[a-zA-Zа-яёА-яЁ]+");
    }
}