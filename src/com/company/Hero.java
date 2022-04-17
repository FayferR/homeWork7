package com.company;

public abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String typeSuperAbility;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeSuperAbility() {
        return typeSuperAbility;
    }

    public void setTypeSuperAbility(String typeSuperAbility) {
        this.typeSuperAbility = typeSuperAbility;
    }
}
