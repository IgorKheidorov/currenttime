import java.util.ArrayList;

/**
 * Find same surnames and displays them.
 */
public class Namesakes extends Command {

    /**
     * @param list storage information about user.
     */
    private void theSameSurnameSearcher(ArrayList<User> list) {
        ArrayList<User> namesakes = new ArrayList<User>();
        for(int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).getSurname().equals(list.get(j).getSurname())) {
                    namesakes.add(list.get(i));
                }
            }
        }
        System.out.println("Namesakes: " + namesakes.toString());
    }

    /**
     * @param users contains information about user.
     */
    @Override
    public void doCommand(ArrayList<User> users) {
        theSameSurnameSearcher(users);
    }
}
