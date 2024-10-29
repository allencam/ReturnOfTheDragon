package com.ps;

import java.util.ArrayList;

public class Player extends Character {
    private short experiencePoints;
    private byte cityReputation;
    private byte exhaustion;
    private ArrayList<Items> playerInventory;

    public Player(String name, short currentHealth, short maxHealth, Stats stats, byte level, byte armorClass, short experiencePoints, byte cityReputation, byte exhaustion, ArrayList<Items> playerInventory) {
        super(name, currentHealth, maxHealth, stats, level, armorClass);
        this.experiencePoints = experiencePoints;
        this.cityReputation = cityReputation;
        this.exhaustion = exhaustion;
        this.playerInventory = new ArrayList<>();
    }

    public short getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(short experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public byte getCityReputation() {
        return cityReputation;
    }

    public void setCityReputation(byte cityReputation) {
        this.cityReputation = cityReputation;
    }

    public byte getExhaustion() {
        return exhaustion;
    }

    public void setExhaustion(byte exhaustion) {
        this.exhaustion = exhaustion;
    }
}
