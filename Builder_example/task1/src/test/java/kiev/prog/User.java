package kiev.prog;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;

        public UserBuilder userName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            User user = new User(this);
            if (user.getAge() > 120) {
                throw new IllegalStateException("Age is out of range");
            }
            return user;
        }
    }

    @Override
    public String toString() {
        System.out.println("Current user data is following: ");
        String userData = String.format(" First name: %s\n Last name: %s\n Phone: %s\n Age: %s years\n",
                this.firstName, this.lastName, this.phone, this.age);
        return userData;
    }
}
