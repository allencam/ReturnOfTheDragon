package com.ps;

public class Character {
    private String name;
    private short currentHealth;
    private short maxHealth;
    private Stats stats;
    private byte level;
    private byte armorClass;

    public Character(String name, short currentHealth, short maxHealth, Stats stats, byte level, byte armorClass) {
        this.name = name;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.stats = stats;
        this.level = level;
        this.armorClass = armorClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(short currentHealth) {
        this.currentHealth = currentHealth;
    }

    public short getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(short maxHealth) {
        this.maxHealth = maxHealth;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    public byte getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(byte armorClass) {
        this.armorClass = armorClass;
    }
}
