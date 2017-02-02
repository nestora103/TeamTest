package ru.geekbrains.java2.dz.dz1.gubenkoDM;

import java.util.Random;

/**
 * Created by DmitriX on 24.11.2016.
 */
public class Coach implements Const {
    private String coachName;

    public Coach(String coachName) {
        this.coachName=coachName;
    }

    public void joinPlayers(Player[] players){
        Random rand=new Random();
        for (int i=0;i<PLAYERSINTEAM;i++){
            String plName;
            switch (i){
                case 0:
                    plName="Петя";
                    break;
                case 1:
                    plName="Вася";
                    break;
                case 2:
                    plName="Коля";
                    break;
                case 3:
                    plName="Иван";
                    break;
                default:
                    plName="Игрок";
            }
            players[i]=new Player(plName,rand.nextInt(PLAYER_SKILL_NUM)+6,
                    rand.nextInt(PLAYER_SKILL_NUM)+6,rand.nextInt(PLAYER_SKILL_NUM)+6,rand.nextInt(PLAYER_SKILL_NUM)+6);
        }
    }
}
