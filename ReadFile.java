package scheduler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void readFile(Storage<Task> deposit, String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line = null;
        Scanner scanner = null;
        int index = 0;

        while ((line = reader.readLine()) != null) {
            Task task = new Task();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0) {
                    task.setId(data);
                }
                else if (index == 1) {
                    task.setTaskTitle(data);
                }
                else if (index == 2) {
                    task.setDate(Long.parseLong(data));
                }
                else if (index == 3) {
                    task.setDeadline(data);
                }
                else if (index == 4) {
                    task.setAuthorName(data);
                }
                else if (index == 5) {
                    task.setAuthorSurname(data);
                }
                else System.out.println("Некорректные данные::" + data);
                index++;
            }
            index = 0;
            deposit.addTask(task);
        }
        reader.close();
    }
}
