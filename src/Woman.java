package src;

public class Woman extends Person {
    private String firstName;
    private String lastName;
    private Person partner;
    private int age;
    private String oldLastName;


    public Woman(String anna, String black, Object alex, int age) {
        super();
    }


    @Override
    public boolean isRetired() {
        return getAge() > 60;
    }

    @Override
    public void registerPartnership(Person partner) {
        if (partner == null) {
            this.lastName = partner.getLastName();
            setLastName(partner.getLastName());
        } else lastName  = this.lastName;
    }

    @Override
    public void deregisterPartnership(boolean returnToOldLastName) {
        if (partner == null) {
            System.out.println(getFirstName() + " " + getLastName() + "- has no partner.");
            return;
        }
        if (returnToOldLastName) {
            setLastName(oldLastName);
        }
        setPartner(null);
    }
}

