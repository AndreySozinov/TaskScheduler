package scheduler;

import java.util.Calendar;

public class TaskMidPriority extends Task{
    public TaskMidPriority(
        String taskTitle, 
        Calendar deadLine, 
        String authorFirstName,
        String authorLastName) {
        super(taskTitle, deadLine, authorFirstName, authorLastName);
    }
}
