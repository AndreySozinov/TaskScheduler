package scheduler;

import java.util.Calendar;

public class TaskLowPriority extends Task{
    public TaskLowPriority(
        String taskTitle, 
        Calendar deadLine, 
        String authorFirstName,
        String authorLastName) {
        super(taskTitle, deadLine, authorFirstName, authorLastName);
    }
}
