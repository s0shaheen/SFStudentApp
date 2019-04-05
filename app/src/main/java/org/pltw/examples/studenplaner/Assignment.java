package org.pltw.examples.studenplaner;

public class Assignment {
    private String name; // Name of the assignment.
    private String month; // Month of the due date of the assignment.
    private String day; // Day of the due date of the assignment.
    private String type; // Type of assignment.
public Assignment(){
    name = "";
    month = "";
    day = "";
    type = "";
}
public Assignment(String name, String month, String day, String type){
    this.name = name;
    this.month = month;
    this.day = day;
    this.type = type;
}
//Getters

    public String getName() {
        return name;
    }

    public String getMonth() {
        return month;
    }

    public String getType() {
        return type;
    }
    public String getDay() {
        return day;
    }
//Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setType(String type) {
        this.type = type;
    }

}
