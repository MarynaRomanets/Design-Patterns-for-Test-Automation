package kiev.prog;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder().setName("Rob", "Ch").setAge(99).setCity("Ngeter").setPhone("254897")
                .setProfession("Writer").build();
        System.out.println(person.toString());

        Person person1 = new Person.Builder().setName("Marta", "Hrytrt").setAge(70).setCity("Getrrr").setPhone("5445522")
                .setProfession("Logistic").build();
        System.out.println(person1.toString());
    }
}
