public class Truck extends Car{

    int weight;

    /***
     * parameterized constructor
     * @param speed - to assign speed
     * @param regularPrice - to assign regular price
     * @param color - to assign color
     * @param weight - to assign weight
     */
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    /***
     * getSalePrice method is created to calculate discount
     * @return - returning sale price
     */
    public double getSalePrice() {

        double salePrice, discount;
        // if weight is greater than 2000 discount is 10%
        if (weight > 2000) {
            System.out.println("Truck weight is greater than 2000 ");
            discount = regularPrice * 10 / 100;
            System.out.println("Discount : " + discount);

        }
        // if weight is less than 2000 discount is 20%
        else {
            System.out.println("Truck weight is less than 2000");
            discount = regularPrice * 20 / 100;
            System.out.println("Discount : " + discount);
        }
        salePrice = regularPrice - discount;
        return salePrice;
    }
}
