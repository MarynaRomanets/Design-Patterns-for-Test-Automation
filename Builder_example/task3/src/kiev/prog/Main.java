package kiev.prog;

public class Main {

    public static void main(String[] args) {
        Clothes clothes = new Clothes.Builder().withType("Jeans").withSize("L").withColor("Blue")
                .withPrice(6.99).withAmount(185).build();
        System.out.println(clothes.toString());
    }
}
