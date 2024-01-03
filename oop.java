public class oop {
    public class HotDrink extends Product {
        private int temperature; // дополнительное поле

        public HotDrink(String name, double price, int temperature) {
            super(name, price);
            this.temperature = temperature;
        }

        @Override
        public String toString() {
            return super.toString() + ", Temperature: " + temperature + "°C";
        }

        // Геттеры и сеттеры для температуры, если необходимо
        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }
    }

    public class Main {
        public static void main(String[] args) {
            VendingMachine machine = new VendingMachine();
            machine.addProduct(new HotDrink("Coffee", 1.5, 90));
            machine.addProduct(new HotDrink("Tea", 1.2, 85));
        }
    }

}
