import java.util.ArrayList;
/**
 * Output the data command in the console.
 */
public class OutputCommands {

    public OutputCommands(ArrayList<User> users) {
        AverageAge averageAge = new AverageAge();
        averageAge.doCommand(users);
        TheOldestUser theOldestUser = new TheOldestUser();
        theOldestUser.doCommand(users);
        TheMostPopularFemaleName theMostPopularFemaleName = new TheMostPopularFemaleName();
        theMostPopularFemaleName.doCommand(users);
        Namesakes namesakes = new Namesakes();
        namesakes.doCommand(users);
    }
}
