import java.util.Scanner;

public class MyOwnAutoShop {

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) {

        /***
         * PROCEDURE
         * 1. created sedanRed, displaying discount and price
         * 2. created sedanWhite, displaying discount and price
         * 3. created fordRed, displaying discount and price
         * 4. created fordWhite, displaying discount and price
         * 5. created car and price
         * 6. created truckRed, displaying discount and price
         * 7. created truckWhite, displaying discount and price
         */

        /***
         * 1. created sedanRed and displaying price
         */
        System.out.println("----------------------- Sedan -----------------------");
        Sedan sedanRed = new Sedan(120, 500000, "red", 10);
        System.out.println("Price of Sedan : " + sedanRed.getSalePrice());

        /***
         * 2. created sedanWhite and displaying price
         */
        Sedan sedanWhite = new Sedan(180, 600000, "white", 50);
        System.out.println("Price of Sedan : " + sedanWhite.getSalePrice());

        /***
         * 3. created fordRed, displaying discount and price
         */
        System.out.println("----------------------- Ford -----------------------");
        Ford fordRed = new Ford(120, 500000, "red", 2005, 20);
        System.out.println("Price of Ford : " + fordRed.getSalePrice());

        /***
         * 4. created fordWhite, displaying discount and price
         */
        Ford fordWhite = new Ford(180, 600000, "white", 2005, 10);
        System.out.println("Price of Ford : " + fordWhite.getSalePrice());

        /***
         * 5. created car and price
         */
        System.out.println("----------------------- Car -----------------------");
        Car car = new Car(120, 500000, "red");
        System.out.println("Price of Car : " + car.getSalePrice());

        /***
         * 6. created truckRed and displaying price
         */
        System.out.println("----------------------- Truck -----------------------");
        Truck truckRed = new Truck(120, 500000, "red", 5000);
        System.out.println("Price of Truck : " + truckRed.getSalePrice());

        /***
         * 7. created truckWhite and displaying price
         */
        Truck truckWhite = new Truck(180, 600000, "white", 1000);
        System.out.println("Price of Truck : " + truckWhite.getSalePrice());

    }
}
