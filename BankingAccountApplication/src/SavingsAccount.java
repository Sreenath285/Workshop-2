public class SavingsAccount {

    /***
     * PROCEDURE
     * 1. created calculateMonthlyInterest method to calculate monthly interest and current balance
     * 2. created modifyInterestRate method to set the annual interest
     * 3. created getSavingsBalance method to get the updated balance
     */

    public static double annualInterestRate ;
    private double savingsBalance;
    private String saver;

    /***
     * created constructor
     * @param savingsBalance - savingsBalance to initialize while creating object
     */
    public SavingsAccount(String saver, double savingsBalance) {
        this.saver = saver;
        this.savingsBalance = savingsBalance;
    }

    /***
     * 1. created calculateMonthlyInterest method to calculate monthly interest and current balance
     * @return - returning monthlyInterest
     */
    public void calculateMonthlyInterest() {

        // calculating monthly interest
        double monthlyInterest = (savingsBalance * (annualInterestRate / 100)) / 12;
        System.out.println(saver + " - Monthly interest : " + monthlyInterest);

        // calculating savings balance after adding annual interest rate
        savingsBalance = savingsBalance + monthlyInterest;
        System.out.println(saver + " - Updated savings balance : " + savingsBalance);

    }

    /***
     * 2. created modifyInterestRate method to set the annual interest
     * @param annualInterestRate - setting annualInterestRate
     */
    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    /***
     * 3. created getSavingsBalance method to get the updated balance
     * @return - returning savingBalance
     */
    public double getSavingsBalance() {
        return savingsBalance;
    }
}
