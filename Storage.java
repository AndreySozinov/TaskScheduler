package scheduler;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    List<Task> lowPriority = new ArrayList<>();
    List<Task> mediumPriority = new ArrayList<>();
    List<Task> highPriority = new ArrayList<>();

    public void add(Task task) {
        switch(task.getPriority()) {
            case LOW:
                lowPriority.add(task);
                break;
            case MIDDLE:
                mediumPriority.add(task);
                break;
            case IMMIDIATE:
                highPriority.add(task);
                break;
        }
    }

    public void showTasks() {
        lowPriority.sort(new DeadlineComparator());
        mediumPriority.sort(new DeadlineComparator());
        highPriority.sort(new DeadlineComparator());

        for (Task task : highPriority) {
            System.out.println(task);
        }
        for (Task task : mediumPriority) {
            System.out.println(task);
        }
        for (Task task : lowPriority) {
            System.out.println(task);
        }
    }

    public void deleteTask(Task task) {
        if (highPriority.contains(task)) {
            highPriority.remove(task);
            return;
        }
        if (mediumPriority.contains(task)) {
            highPriority.remove(task);
            return;
        }
        if (lowPriority.contains(task)) {
            highPriority.remove(task);
        }
    }
}
