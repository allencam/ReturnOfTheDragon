package com.ps;

public class Items {
    private String name;
    private boolean isConsumable;
    private short sellValue;

    public Items(String name, boolean isConsumable, short sellValue) {
        this.name = name;
        this.isConsumable = isConsumable;
        this.sellValue = sellValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConsumable() {
        return isConsumable;
    }

    public void setConsumable(boolean consumable) {
        isConsumable = consumable;
    }

    public short getSellValue() {
        return sellValue;
    }

    public void setSellValue(short sellValue) {
        this.sellValue = sellValue;
    }
}
