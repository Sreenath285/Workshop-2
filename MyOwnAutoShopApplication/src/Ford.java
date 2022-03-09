public class Ford extends Car{

    int year;
    int manufacturerDiscount;

    /***
     * parameterized constructor
     * @param speed - to assign speed
     * @param regularPrice - to assign regular price
     * @param color - to assign color
     * @param year - to assign year
     * @param manufacturerDiscount - to assign manufacturer discount to regular price
     */
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    /***
     * getRegularPrice method to calculate regular price after discount
     * @return - returning regular price after deducing manufacturer discount
     */
    public double getSalePrice() {
        double discount = regularPrice * manufacturerDiscount / 100;
        System.out.println("Discount : " + discount);
        double salePrice = regularPrice - discount;
        return salePrice;
    }
}
