package kiev.prog;

public class Clothes {
    private String type;
    private String color;
    private String size;
    private double price;
    private int amount;

    private Clothes ( String type, String color, String size, double price, int amount ) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.price = price;
        this.amount = amount;
    }

    public static class Builder {
        private String type;
        private String color;
        private String size;
        private double price;
        private int amount;

        public Builder () {
        }

        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withColor(String type) {
            this.color = color;
            return this;
        }

        public Builder withSize(String size) {
            this.size = size;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder withAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public Clothes build() {
            return new Clothes(this.type, this.color, this.size, this.price, this.amount);
        }
    }

    @Override
    public String toString() {
        String clothesString = String.format("Clothes: type: %s, color: %s, size: %s, price: %s, amount: %s",
                this.type, this.color, this.size, this.price, this.amount);
        return clothesString;
    }
}
