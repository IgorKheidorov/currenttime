import java.util.ArrayList;

/**
 * Find the average age of all users.
 */
public class AverageAge extends Command {

    /**
     * @param list storage information about user.
     */
    private void averageAge(ArrayList<User> list) {
        double average = 0;
        int totalAge = 0;
        for (User user : list) {
            totalAge += user.getAge();
        }
        average = totalAge / list.size();
        System.out.println("Average age:  " + average);
    }

    /**
     * @param users contains information about user.
     */
    @Override
    public void doCommand(ArrayList<User> users) {
        averageAge(users);
    }
}
