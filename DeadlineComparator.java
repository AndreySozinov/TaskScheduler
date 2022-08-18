package scheduler;

import java.util.Comparator;

public class DeadlineComparator implements Comparator<Task>{
    @Override
    public int compare(Task o1, Task o2) {
        if (o1.getDeadline().after(o2.getDeadline())) {
            return 1;
        }
        if (o1.getDeadline().before(o2.getDeadline())) {
            return -1;
        }
        return 0;
    }
}
