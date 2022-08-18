package scheduler;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Спроектировать и реализовать планировщик дел для работы 
// с задачами разных приоритетов.

// Например:
// - определить уровень приоритетов: низкий, средний, немедленное выполнение;
// - выделить компоненту для хранения данных;
// - выделить компоненту для организации импорта\экспорта данных;
// Файл должен содержать следующие данные: id, дату добавления записи, 
// время добавления записи, дедлайн задачи, ФИО автора;
// - данные хранятся в файле csv/json/xml;
// - другие компоненты;

public class Program {
    public static void main(String[] args) {
        Calendar deadlineTask01 = new GregorianCalendar(2023, 0, 21);
        Task task01 = new TaskHighPriority("Start", deadlineTask01, "Andrey", "Petrov");

        Calendar deadlineTask02 = new GregorianCalendar(2022, 10, 15);
        Task task02 = new TaskHighPriority("Agreement", deadlineTask02, "Andrey", "Petrov");

        Calendar deadlineTask03 = new GregorianCalendar(2022, 11, 23);
        Task task03 = new TaskHighPriority("Work", deadlineTask03, "George", "Smith");

        Calendar deadlineTask04 = new GregorianCalendar(2022, 9, 23);
        Task task04 = new TaskLowPriority("Change gifs", deadlineTask04, "George", "Smith");

        Storage<Task> myStorage = new Storage<>();
        myStorage.addTask(task01);
        myStorage.addTask(task02);
        myStorage.addTask(task03);
        myStorage.addTask(task04);

        myStorage.showTasks();

        Storage<TaskHighPriority> highStorage = new Storage<>();
        highStorage.addTask((TaskHighPriority)task01);
        highStorage.addTask((TaskHighPriority)task02);
        highStorage.addTask((TaskHighPriority)task03);

        highStorage.showTasks();

        SaveAs<Task> saveCsv = new SaveAs<>();
        saveCsv.csv(myStorage, "MyFile");
        
        SaveAs<TaskHighPriority> saveXml = new SaveAs<>();
        saveXml.xml(highStorage, "MyFile2");
    }
}
