package StudentSurvey;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Multiplication_Table multiplicationTable = new Multiplication_Table();
        System.out.println(multiplicationTable);
        //Task task = new Task(3,4);
        //Task task1 = new Task(3,4);
        Task task2 = new Task(5,9);
        Set<Task> tasks = new HashSet<>();
        //tasks.add(task);
        //tasks.add(task1);
        tasks.add(task2);
        System.out.println(tasks);
    }
}