package src;

public class Woman extends Person {

    private String oldLastName;

    public Woman(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired() {

        return getAge() > 60;
    }


    public void registerPartnership() {
        if (getPartner() == null) {
            setLastName(getPartner().getLastName());
        } else
            System.out.println("Has a partner");;
    }

    public void deregisterPartnership(boolean returnToOldLastName) {
        if (getPartner() == null) {
            System.out.println(getFirstName() + " " + getLastName() + "- has no partner.");
            return;
        }
        if (returnToOldLastName) {
            setLastName(oldLastName);
        }
        setPartner(null);
    }
}

