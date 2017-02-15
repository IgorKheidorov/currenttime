import java.util.ArrayList;

/**
 * Searches for and displays the name of the oldest user
 */
public class TheOldestUser extends Command {
    /**
     * @param list storage information about user.
     * @throws IndexOutOfBoundsException exceptinon about age.
     */
    private void theOldestUser(ArrayList<User> list) throws IndexOutOfBoundsException {
        try {
            int eldestAge = 0;
            User eldestUser = list.get(0);
            for (User user : list) {
                if (eldestAge < user.getAge())
                    eldestAge = user.getAge();
                eldestUser = user;
            }
            System.out.println("The eldest user: " + eldestUser.getName());
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Enter the correct age");
        }
    }

    /**
     * @param users contains information about user.
     */
    @Override
    public void doCommand(ArrayList<User> users) {
        theOldestUser(users);
    }
}
