import java.util.ArrayList;

/**
 * Find the most popular female name and displays it.
 */
public class TheMostPopularFemaleName extends Command {
    /**
     * Field with a known sex
     */
    private String sex = "female";

    /**
     * @param list storage information about user.
     */
    private void theMostPopularFemaleName(ArrayList<User> list) {
        String name = "";
        for(int i = 0; i < list.size(); i++) {
            for (User user : list) {
                if (list.get(i).getSex().equals(sex) && user.getName().equals(list.get(i).getName())) {
                    name = list.get(i).getName();
                }
            }
        }
        System.out.println("The most popular female name: " + name);
    }

    /**
     * @param users contains information about user.
     */
    @Override
    public void doCommand(ArrayList<User> users) {
        theMostPopularFemaleName(users);
    }

}
