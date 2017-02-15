/**
 * Storage and set information about user.
 */
public class User {
    private String name;
    private String surname;
    private String sex;
    private int age;

    public User(String name, String surname, String sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getSex() {
        return this.sex;
    }
    public int getAge() {
        return this.age;
    }

    /**
     * @return all data about user.
     */
    @Override
    public String toString() {
        return( "Name: " + this.getName() + " Surname: " + this.getSurname() + " Sex: " + this.getSex() + " Age: " + this.getAge() + " | ");
    }
}
