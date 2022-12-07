package Number;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
public class IntegerNumber {
    public static void numberSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20){
            numbers.add(random.nextInt(1001));
        }
       Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}