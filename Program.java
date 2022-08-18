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
        Task task01 = new Task(Priority.IMMIDIATE, "Start", deadlineTask01, "Andrey", "Petrov");

        Calendar deadlineTask02 = new GregorianCalendar(2022, 10, 15);
        Task task02 = new Task(Priority.IMMIDIATE, "Agreement", deadlineTask02, "Andrey", "Petrov");

        Calendar deadlineTask03 = new GregorianCalendar(2022, 11, 23);
        Task task03 = new Task(Priority.IMMIDIATE, "Work", deadlineTask03, "George", "Smith");

        Calendar deadlineTask04 = new GregorianCalendar(2022, 9, 23);
        Task task04 = new Task(Priority.LOW, "Change gifs", deadlineTask04, "George", "Smith");

        Storage myStorage = new Storage();
        myStorage.add(task01);
        myStorage.add(task02);
        myStorage.add(task03);
        myStorage.add(task04);

        myStorage.showTasks();

        SaveAs saveCsv = new SaveAs();
        saveCsv.csv(myStorage, "MyFile");
        
    }
}
