package src;

public class Man extends Person {
    private String firstName;
    private String lastName;
    private Person partner;
    private int age;

    public Man(String firstName, String lastName, Object partner, int age) {
        super(firstName, lastName, partner, age);
    }

    @Override
    public boolean isRetired() {
        return getAge() > 65;
    }

    @Override
    public void registerPartnership(Person partner) {

    }
    @Override
    public void deregisterPartnership(boolean returnToOldLastName) {

    }
}

