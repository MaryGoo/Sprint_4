package ru.praktikum_qa.bank_card;

public class Praktikum {

    public static void main(String[] args) {
        String name = " ТимотиШаламе";
        Account account = new Account(name);
        if (account.checkNameToEmboss()){
            System.out.println("фамилию и имя для печати на банковской карте использовать можно");
            System.out.println(name);
        } else {
            System.out.println("фамилию и имя для печати на банковской карте использовать нельзя");
        }
    }
}