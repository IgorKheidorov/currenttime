/**
 * Main class of application.
 * Contains entry point.
 */
public class Main {
    /**
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Input input = new Input();
        input.inputUserData();
        new OutputCommands(input.getList());

    }
}
