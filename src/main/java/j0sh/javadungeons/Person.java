package j0sh.javadungeons;

public class Person {

    private final String prefix, firstName, middleName, lastName;
    private final Relationship relationship;

    public Person(String prefix, String firstName, String middleName, String lastName, Relationship relationship) {
        this.prefix = prefix;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.relationship = relationship;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public static class Builder {

        private String prefix, firstName, middleName, lastName;
        private Relationship relationship;

        public static Builder builder() {
            return new Builder();
        }

        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder relationship(Relationship relationship) {
            this.relationship = relationship;
            return this;
        }

        public Person create() {
            return new Person(prefix, firstName, middleName, lastName, relationship);
        }

    }

}
