package j0sh.javadungeons;

public class Spouse {

    private final String firstName, lastName;
    private final boolean married;
    private final int marriedYears;

    public Spouse(String firstName, String lastName, boolean married, int marriedYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.married = married;
        this.marriedYears = marriedYears;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isMarried() {
        return married;
    }

    public int getMarriedYears() {
        return marriedYears;
    }

    public static class Builder {

        private String firstName, lastName;
        private boolean married;
        private int marriedYears;

        public static Builder builder() {
            return new Builder();
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder married(boolean married) {
            this.married = married;
            return this;
        }

        public Builder marriedYears(int marriedYears) {
            this.marriedYears = marriedYears;
            return this;
        }

        public Spouse make() {
            return new Spouse(firstName, lastName, married, marriedYears);
        }

    }

}
