package scheduler;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Task> {
    List<T> taskList = new ArrayList<>();

    public void addTask(T task) {
        taskList.add(task);
    }

    public void showTasks() {
        taskList.sort(new DeadlineComparator());

        for (Task task : taskList) {
            System.out.println(task);
        }
    }

    public void deleteTask(Task task) {
        if (taskList.contains(task)) {
            taskList.remove(task);
            return;
        }
    }
}
