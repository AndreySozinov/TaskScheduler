package scheduler;

import java.io.FileWriter;
import java.io.IOException;

public class SaveAs<T extends Task> {
    public Storage<T> storage;
    public String path;
    

    
    public void csv(Storage<T> storage, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
                writer.write(addAllLines(storage));
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }

    public void json(Storage<T> storage, String path) {
        try (FileWriter writer = new FileWriter(path + ".json", false)) {
                writer.write(addAllLines(storage));
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }

    public void xml(Storage<T> storage, String path) {
        try (FileWriter writer = new FileWriter(path + ".xml", false)) {
                writer.write(addAllLines(storage));
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }

    public String addAllLines(Storage<T> stor) {
        StringBuilder sb = new StringBuilder();
        for (Task line : stor.taskList) {
            sb.append(line + "\n");
        }
        return sb.toString();
    }
}
