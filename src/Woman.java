package src;

public abstract class Woman extends Person {
    private String firstName;
    private String lastName;
    private Person partner;
    private int age;
    private String oldLastName;


    public Woman(String anna, String black, Object alex, int age, boolean isMarried) {
        super();
    }


    @Override
    public boolean isRetired() {
        return getAge() > 60;
    }

    @Override
    public void registerPartnership(Person partner) {
        if (partner == null) {
            System.out.println("Has no partner");
        }
    }

    @Override
    public void deregisterPartnership(boolean returnToOldLastName) {
        if (this.partner == null) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + "- has no partner.");
            return;
        }
        if (returnToOldLastName) {
            this.setLastName(this.oldLastName);
        }
        this.partner = null;
    }
}

