package src;

import src.Person;

public class Woman extends Person {
    private String firstName;
    private String lastName;
    private Person partner;
    private int age;
    private boolean isMarried;

    public Woman(String anna, String black, Object alex, int age, boolean isMarried) {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
    private boolean isRetired(boolean isFemale) {
        if (isFemale) {
            return age >= 65;
        } else {
            return age >= 60;
        }
    }
    public void registerPartnership(Person partner, boolean isFemale){
        if (isFemale) {
            this.lastName = partner.getLastName();
        } else lastName  = this.lastName;
    }
    public String deregisterPartnership(boolean revertLastName) {
        if (revertLastName) {
            String previousLastName = getLastName();
            if (previousLastName != null && !previousLastName.equals(lastName)) {
                lastName = previousLastName; //
            }
        }
        return lastName;
    }
    private void isMarried(boolean married) {
        if (married) {
            System.out.println("married");
        } else {
            System.out.println("not married");;
        }
    }
}

