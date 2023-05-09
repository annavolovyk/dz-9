package src;

public abstract class Man extends Person {
    private String firstName;
    private String lastName;
    private Person partner;
    private int age;
    private boolean isMarried;

    public Man(String firstName, String lastName, Object partner, int age, boolean isMarried) {
        super(firstName, lastName, partner, age, isMarried);
    }

    @Override
    public boolean isRetired() {
        return getAge() > 65;
    }
}

