package scheduler;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

public class Task{
    private String id;
    private String taskTitle;
    private Date date;
    private Calendar deadline;
    private String authorFirstName;
    private String authorLastName;


    public Task(String taskTitle, 
                Calendar deadLine, 
                String authorFirstName,
                String authorLastName) {
        this.id = UUID.randomUUID().toString();
        this.taskTitle = taskTitle;
        this.date = new Date();
        this.deadline = deadLine;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public Task() {
        this(null, null, null, null);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String title) {
        this.taskTitle = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = new Date(date);
    }

    public Calendar getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = new GregorianCalendar();
    }

    public String getAuthorName() {
        return authorFirstName;
    }

    public void setAuthorName(String name) {
        this.authorFirstName = name;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorSurname(String surname) {
        this.authorLastName = surname;
    }


    @Override
    public String toString() {
        return String.format("id: %s Priority: %s Task: %s Date: %s Deadline: %s Author: %s %s", 
                            id, getClass().getSimpleName(), taskTitle, date, deadline.getTime(), authorFirstName, authorLastName);
    }
}
