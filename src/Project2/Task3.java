package Project2;

public class Task3 {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println("The final price of car with all discounts: " + truck.calculateSalePrice(15000, 1900));

        Sedan sedan = new Sedan();
        System.out.println("The final price of car with all discounts: " + sedan.calculateSalePrice(11000, 25));
    }
}

class Car {
    double carPrice;
    double salePrice;

    double calculateSalePrice(double carPrice, int weight) {
        return salePrice;
    }
}

class Sedan extends Car {
    @Override
    double calculateSalePrice(double carPrice, int length) {
        if (length > 20) {
            salePrice = carPrice * 0.95;
        } else {
            salePrice = carPrice * 0.9;
        }
        return salePrice;
    }
}

class Truck extends Car {
    @Override
    double calculateSalePrice(double carPrice, int weight) {
        if (weight > 2000) {
            salePrice = carPrice * 0.9;
        } else {
            salePrice = carPrice * 0.8;
        }
        return salePrice;
    }
}
