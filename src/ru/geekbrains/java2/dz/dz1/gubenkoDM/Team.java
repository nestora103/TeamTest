package ru.geekbrains.java2.dz.dz1.gubenkoDM;

/**
 * Created by DmitriX on 24.11.2016.
 */
public class Team implements TeamInfo {
    private String teamName;

    public Player[] getPlayers() {
        return players;
    }

    private Player[] players;

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    @Override
    //вывод информации обо всех членах команды
    public void showTeamPlayersInfo() {
        System.out.println("Название команды:".concat(teamName));
        for (Player pl:players) {
            System.out.println("Имя игрока:"+pl.getName()+" Сила:"+pl.getStrength()+" Ловкость:"+pl.getAgility()+
                    " Интелект:"+pl.getIntellect()+" Точность:"+pl.getAccuracy());
        }
        System.out.println(" ");
    }

    @Override
    //вывод информации обо всех прошедших полосу препятствий
    public void showWinPlayersInfo() {
        showTeamPlayersInfo();
        System.out.println("Прошли все препятствия следующие игроки!");
        for (Player pl:players) {
            if (pl.isPassed()){
                System.out.println("Имя игрока:"+pl.getName()+" Сила:"+pl.getStrength()+" Ловкость:"+pl.getAgility()+
                        " Интелект:"+pl.getIntellect()+" Точность:"+pl.getAccuracy());
            }
        }
        System.out.println(" ");
    }
}
