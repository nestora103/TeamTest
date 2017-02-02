package ru.geekbrains.java2.dz.dz1.gubenkoDM;

/**
 * Created by DmitriX on 24.11.2016.
 */
public class Player {
    private String name;
    private int strength;
    private int agility;
    private int intellect;
    private int accuracy;
    private boolean passed=false;

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public Player(String name, int strength, int agility, int intellect, int accuracy) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.accuracy = accuracy;
    }
}
