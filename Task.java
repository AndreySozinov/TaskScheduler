package scheduler;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Task {
    private String id;
    //private Priority priority;
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

    // public Priority getPriority() {
    //     return priority;
    // }

    public Calendar getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return String.format("id: %s Task: %s Date: %s Deadline: %s Author: %s %s", 
                            id, taskTitle, date, deadline.getTime(), authorFirstName, authorLastName);
    }
}
