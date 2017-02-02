package ru.geekbrains.java2.dz.dz1.gubenkoDM;

import java.util.Scanner;

/**
 * Created by DmitriX on 24.11.2016.
 */
public class Competition implements Const {
    public static void main(String[] args) {
        //ввод количества препятствий в полосе
        System.out.println("Введите количество препятствий в полосе препятствий:");
        Scanner sc=new Scanner(System.in);
        //создание полосы препятствий
        Course course=new Course(sc.nextInt());
        //создадим тренера для команды
        Coach co=new Coach("Валера");
        //Создадим массив игроков 1 команды
        Player[] players1=new Player[PLAYERSINTEAM];
        //Создадим массив игроков 2 команды
        Player[] players2=new Player[PLAYERSINTEAM];
        //попросим тренера набрать игроков в команду
        co.joinPlayers(players1);
        //1 команда
        Team t1=new Team("Спартак",players1);
        co.joinPlayers(players2);
        //2 команда
        Team t2=new Team("Зенит",players2);

        //прохождение препятствий 1 командой
        course.passageOfObstacles(t1);
        //прохождение препятствий 2 командой
        course.passageOfObstacles(t2);

        //статистика по первой команде
        t1.showWinPlayersInfo();
        //статистика по второй команде
        t2.showWinPlayersInfo();
    }
}
