package austral.prog2.PracticaPrimerParcial.Parcial2018.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class User implements Nameable{

    String name;
    List<Habit> habits;
    List<Notification> notifications; //recive las de share activity y las de completedactivity
    List<ShareActivityNotification> sendNotifications; //solo guarda las de share activity

    public User(String name) {
        this.name = name;
        this.habits = new ArrayList<>();
        this.notifications = new ArrayList<>();
        this.sendNotifications = new ArrayList<>();
    }

    public void addHabit(Habit habit){
        habits.add(habit);
    }

    public void workHabit(String habitName, String activityName){
        try{
            int habitPosition = getHabitPosition(habitName);
            int habitLevel = habits.get(habitPosition).getLevel();
            habits.get(habitPosition).workHabit(activityName);
            if(habits.get(habitPosition).getLevel() > habitLevel){
                shareLevelUp(habitName);
            }
        }catch(Exception e){
            return;
        }
    }

    public void shareLevelUp(String habitName) {
        for (int i = 0; i < sendNotifications.size(); i++) {
            if(sendNotifications.get(i).getHabitName().equals(habitName)){
                CompletedActivityNotification notification = new CompletedActivityNotification(this,sendNotifications.get(i).getReciver(),habitName);
                sendNotifications.get(i).getReciver().reciveNotification(notification);
            }
        }
    }

    public void reciveNotification(Notification notification){
        notifications.add(notification);
    }

    public void shareActivity(String habitName, String activityName, User reciver){
        try{
            int i = getHabitPosition(habitName);
            habits.get(i).shareActivity(activityName);
            ShareActivityNotification notification = new ShareActivityNotification(this,reciver, habitName,activityName);
            reciver.reciveNotification(notification);
            sendNotifications.add(notification);
        }catch (IllegalArgumentException e){
            return;
        }
    }

    public int[] showResults(String habitName){
        try{
            return habits.get(getHabitPosition(habitName)).pointsPerActivity();
        }catch(IllegalArgumentException e){
            return null;
        }

    }

    public int getHabitPosition(String habitName){
        int habitPosition = -1;
        for (int i = 0; i < habits.size(); i++) {
            if(habits.get(i).getHabitName().equals(habitName)){
                habitPosition = i;
                break;
            }
        }
        if(habitPosition == -1){
            throw new IllegalArgumentException("The habit was not found");
        }
        return habitPosition;
    }

    @Override
    public String getName() {
        return name;
    }
}
