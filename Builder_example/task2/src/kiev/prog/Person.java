package kiev.prog;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String city;
    private final String phone;
    private final String profession;

    private Person ( String firstName, String lastName, int age, String city, String phone, String profession ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.phone = phone;
        this.profession = profession;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String city;
        private String phone;
        private String profession;

        public Builder () {
        }

        public Builder setName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setProfession(String profession) {
            this.profession = profession;
            return this;
        }

        public Person build() {
            return new Person(this.firstName, this.lastName, this.age, this.city, this.phone, this.profession);
        }
    }

    @Override
    public String toString() {
        String personString = String.format("Person -> First Name: %s\n Last name: %s\n Age: %s\n City: %s\n Phone: %s\n " +
                "Profession: %s", this.firstName, this.lastName, this.age, this.city, this.phone, this.profession);
        return personString;
    }
}
