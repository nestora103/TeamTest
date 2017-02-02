package ru.geekbrains.java2.dz.dz1.gubenkoDM;

/**
 * Created by DmitriX on 24.11.2016.
 */
public class IntellectObstacle implements Passable {
    @Override
    public boolean isPassed(Player player) {
        return player.getIntellect()>=INTELLECT_RATE;
    }
}
