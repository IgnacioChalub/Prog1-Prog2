package austral.prog2.PracticaPrimerParcial.Parcial2018.Ejercicio1;

import austral.prog2.tp6.Ejercicio1.List;

public class Habit {

    String habitName;
    int level;
    Activity excercise;
    Activity study;
    Activity experience;

    public Habit(String habitName, int level) {
        this.habitName = habitName;
        this.level = level;
        excercise = new Activity("excercise", 3);
        study = new Activity("study",4);
        experience = new Activity("experience", 10);
    }

    public String getHabitName(){
        return habitName;
    }

    public int getLevel(){
        return level;
    }

    public void workHabit(String tipo){
        if(tipo.equals("excercise")){
            excercise.work();
        }else if(tipo.equals("study")){
            study.work();
        }else if(tipo.equals("experience")){
            experience.work();
        }else{
            throw new IllegalArgumentException("No puede trabajar el habito con esa actividad");
        }
        updateLevel();
    }

    public void updateLevel(){
        if(level == 5){
            return;
        }
        if(excercise.getTotalPoints() >= 30 && study.getTotalPoints() >= 12 && experience.getTotalPoints() >= 50){
            level++;
        }
    }

    public void shareActivity(String tipo){
        if(tipo.equals("excercise")){
            excercise.share();
        }else if(tipo.equals("study")){
            study.share();
        }else if(tipo.equals("experience")){
            experience.share();
        }else{
            throw new IllegalArgumentException("No puede comapartir esa actividad");
        }
    }

    public int[] pointsPerActivity(){
        int[] pointsPerActivity = new int[3];
        pointsPerActivity[0] = excercise.getTotalPoints();
        pointsPerActivity[1] = study.getTotalPoints();
        pointsPerActivity[2] = experience.getTotalPoints();
        return pointsPerActivity;
    }


}
