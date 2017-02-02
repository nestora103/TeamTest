package ru.geekbrains.java2.dz.dz1.gubenkoDM;

/**
 * Created by DmitriX on 24.11.2016.
 */
public class Course {
    private int courseNum;
    private Obstacle[] obstacles;

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    //инициализация полосы препятствий
    public Course(int courseNum) {
        this.courseNum=courseNum;
        //инициализируем препятствия
        obstacles=new Obstacle[getCourseNum()];
        createObstacles();
    }

    //создание препятствий на полосе
    public void createObstacles(){
        for (int i = 0; i <getCourseNum(); i++) {
            switch (i){
                case 0:
                    //сила
                    obstacles[i]=new StrengthObstacle();
                    break;
                case 1:
                    //ловкость
                    obstacles[i]=new AgilityObstacle();
                    break;
                case 2:
                    //интеллект
                    obstacles[i]=new IntellectObstacle();
                    break;
                case 3:
                    //точность
                    obstacles[i]=new AccuracyObstacle();
                    break;
                default:
                    //заглушка
                    obstacles[i]=new StrengthObstacle();
            }
        }
    }

    //прохождение препятствий
    public void passageOfObstacles(Team team){
        //перебираем всех игроков команды
        for (Player pl:team.getPlayers()) {
            boolean isOk=true;
            //прогоним каждого по всем препятствиям
            for (Obstacle obs:obstacles) {
                if (!obs.isPassed(pl)){
                    isOk=false;
                }
            }
            pl.setPassed(isOk);
        }
    }


}
