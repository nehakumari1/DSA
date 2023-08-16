import java.util.*;

    class Laptop {
        int price;
        String model;

        public static void main(String[] args) {


            Laptop obj1 = new Laptop();
            Laptop obj2 = new Laptop();
            obj1.model = "Lenovo Yoga";
            obj1.price = 1000;
            obj2.model = "Lenovo Yoga";
            obj2.price = 1000;


        }


        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Laptop laptop = (Laptop) o;
            return price == laptop.price && Objects.equals(model, laptop.model);
        }

        @Override
        public int hashCode() {
            return Objects.hash(price, model);
        }
    }





