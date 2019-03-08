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

}
