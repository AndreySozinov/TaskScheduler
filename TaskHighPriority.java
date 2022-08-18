package scheduler;

import java.util.Calendar;

public class TaskHighPriority extends Task{
    public TaskHighPriority(
                String taskTitle, 
                Calendar deadLine, 
                String authorFirstName,
                String authorLastName) {
        super(taskTitle, deadLine, authorFirstName, authorLastName);
    }
}
