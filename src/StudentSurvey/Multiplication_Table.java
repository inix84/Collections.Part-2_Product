package StudentSurvey;
import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class Multiplication_Table {
    private final Set<Task> tasks = new HashSet<>();
    public Multiplication_Table() {
        Random random = new Random();
        while (tasks.size() < 15) {
            tasks.add(new Task(random.nextInt((9 - 2) + 1) + 2,
                    random.nextInt((9 - 2) + 1) + 2));
        }
    }
    @Override
    public String toString() {
        return "Таблица умножения: " + tasks;
    }
}

