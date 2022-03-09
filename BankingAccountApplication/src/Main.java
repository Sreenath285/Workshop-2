import java.util.Scanner;

public class Main {

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) {

        /***
         * PROCEDURE
         * 1. created saver1
         * 2. created saver2
         * 3. setting annual interest 4 for saver1 and saver 2
         * 4. calculating monthly interest for saver1
         * 5. calculating monthly interest for saver2
         * 6. initializing updated savings balance amount to saver1 and saver2
         * 7. setting annual interest 5 for saver1 and saver2
         * 8. calculating interest for saver1 for next month
         * 9. calculating interest for saver2 for next month
         */

        /***
         * 1. created saver1 and setting annualInterestRate
         */
        SavingsAccount saver1 = new SavingsAccount("Saver 1" ,2000);
        SavingsAccount saver2 = new SavingsAccount("Saver 2", 3000);

        /***
         * 3. setting annual interest for saver1 and saver 2
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual interest rate for month 1 : ");
        double annInt = sc.nextDouble();
        SavingsAccount.modifyInterestRate(annInt);

        /***
         * 4. calculating monthly interest for saver1
         */
        System.out.println("-------------- Month 1 ---------------------");
        saver1.calculateMonthlyInterest();

        /***
         * 5. calculating monthly interest for saver2
         */
        saver2.calculateMonthlyInterest();

        /***
         * 6. initializing updated savings balance amount to saver1 and saver2
         */
        saver1 = new SavingsAccount("Saver 1", saver1.getSavingsBalance());
        saver2 = new SavingsAccount("Saver 2", saver2.getSavingsBalance());

        /***
         * 7. setting annual interest 5 for saver1 and saver2
         */
        System.out.println("-------------- Month 2 ---------------------");
        System.out.print("Enter annual interest rate for month 2 : ");
        double annInt2 = sc.nextDouble();
        SavingsAccount.modifyInterestRate(annInt2);

        /***
         * 8. calculating interest for saver1 for next month
         */
        saver1.calculateMonthlyInterest();

        /***
         * 9. calculating interest for saver2 for next month
         */
        saver2.calculateMonthlyInterest();
    }
}
