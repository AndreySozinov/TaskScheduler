package scheduler;

import java.io.FileWriter;
import java.io.IOException;

public class SaveAs {
    public Storage storage;
    public String path;
    

    
    public void csv(Storage storage, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
                writer.write(addAllLines(storage));
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }

    public void json(Storage storage, String path) {
        try (FileWriter writer = new FileWriter(path + ".json", false)) {
                writer.write(addAllLines(storage));
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }

    public void xml(Storage storage, String path) {
        try (FileWriter writer = new FileWriter(path + ".xml", false)) {
                writer.write(addAllLines(storage));
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }

    public String addAllLines(Storage stor) {
        StringBuilder sb = new StringBuilder();
        for (Task line : stor.highPriority) {
            sb.append(line + "\n");
        }
        for (Task line : stor.mediumPriority) {
            sb.append(line + "\n");
        }
        for (Task line : stor.lowPriority) {
            sb.append(line + "\n");
        }
        return sb.toString();
    }
}
