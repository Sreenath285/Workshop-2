public class Sedan extends Car{

    int length;

    /***
     * parameterized constructor
     * @param speed - to assign speed
     * @param regularPrice - to assign regular price
     * @param color - to assign color
     * @param length - to assign length
     */
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    /***
     * getSalePrice method created to calculate discount
     * @return - returning sale price
     */
    public double getSalePrice() {

        double discount, salePrice;
        // if length is greater than 20 feet discount is 5%
        if (length > 20) {
            System.out.println("Length is greater than 20 feet");
            discount = regularPrice * 5 / 100;
            System.out.println("Discount : " + discount);
        }
        // if length is less than 20 feet discount is 10%
        else {
            System.out.println("Length is less than 20 feet");
            discount = regularPrice * 10 / 100;
            System.out.println("Discount : " + discount);
        }
        salePrice = regularPrice - discount;
        return salePrice;
    }
}
