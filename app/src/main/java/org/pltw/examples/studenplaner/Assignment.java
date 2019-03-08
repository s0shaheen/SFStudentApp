package org.pltw.examples.studenplaner;

public class Assignment {
    private int hours; // The hour value of when the assignment was created.
    private int minutes; // The minute value of when the assignment was created.
    private String name; // Name of the assignment.
    private int month; // Month of the due date of the assignment.
    private int day; // Day of the due date of the assignment.
    private String type; // Type of assignment.
public Assignment(){
    hours = 0;
    minutes = 0;
    name = "";
    month = 0;
    day = 0;
    type = "";
}
public Assignment(int hours, int minutes, String name, int month, int day, String type){
    this.hours = hours;
    this.minutes = minutes;
    this.name = name;
    this.month = month;
    this.day = day;
    this.type = type;
}
//Getters
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public String getType() {
        return type;
    }
    public int getDay() {
        return day;
    }
//Setters
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setType(String type) {
        this.type = type;
    }

}
