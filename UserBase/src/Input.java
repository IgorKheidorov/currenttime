import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Enter data about the user.
 */
public class Input {

    private ArrayList<User> list = new ArrayList<>();
    String name;
    String surname;
    String sex;
    int age;

    /**
     * @throws InputMismatchException exception about age.
     */
    public void inputUserData() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        String nextUser;
        try {
            do {
                System.out.println("Enter name:");
                name = in.next();
                System.out.println("Enter surname:");
                surname = in.next();
                System.out.println("Enter sex (male/female):");
                sex = in.next();
                System.out.println("Enter age:");
                age = in.nextInt();
                System.out.println("'y' - next user, any key to stop):");
                nextUser = in.next();
                list.add(new User(name, surname, sex, age));
            } while (nextUser.equals("y"));
        } catch (InputMismatchException exception) {
            System.out.println("Enter age correct please!");
        }
    }

    /**
     * @return collection with info about user.
     */
    public ArrayList<User> getList() {
        return list;
    }
}
