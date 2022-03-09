public class Car {

    private  int speed;
    public double regularPrice;
    private String color;

    /***
     * parameterized constructor
     * @param speed - to assign speed
     * @param regularPrice - to assign regular price
     * @param color - to assign color
     */
    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    /***
     * getSalePrice method created to return regular price
     * @return - returning regular price
     */
    public double getSalePrice() {
        return regularPrice;
    }
}
