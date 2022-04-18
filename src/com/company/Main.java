package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Medic medic = new Medic();
        Magic magic = new Magic();
        Hero[] heroes = {medic, warrior, magic};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}
