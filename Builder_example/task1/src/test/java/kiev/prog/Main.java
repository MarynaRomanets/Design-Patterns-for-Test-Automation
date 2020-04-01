package kiev.prog;

public class Main {
    public static void main ( String[] args ) {
        User testUser = new User.UserBuilder().userName("John", "Dau").age(39).phone("6767684849").build();
        System.out.println(testUser.toString());

        User testUser1 = new User.UserBuilder().userName("Mary", "Raw").age(20).phone("456654546").build();
        System.out.println(testUser1.toString());

        User testUser2 = new User.UserBuilder().build();
        System.out.println(testUser2.toString());

        User testUser3 = new User.UserBuilder().userName("Helen", "Jur").build();
        System.out.println(testUser3);
    }
}
