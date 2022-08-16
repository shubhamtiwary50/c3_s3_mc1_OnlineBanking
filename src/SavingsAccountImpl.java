import java.sql.SQLOutput;
import java.util.Scanner;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount= new SavingsAccount();
        Scanner obj = new Scanner(System.in);
        savingsAccount.setCustomerName("Vaibhav Tiwary");
        savingsAccount.setAccountNumber(1234566847);
        savingsAccount.setAccountOpeningDate(" 29th February 2016 ");
        savingsAccount.setAccountStatus(true);
        savingsAccount.setAvailableBalance(1000.0);
        savingsAccount.setTotalBalance(10000.0);
        savingsAccount.setOnlineBankingStatus("Online Banking - Active");
        savingsAccount.setInterestRate(7.5);
        savingsAccount.setModeOfAccountOperation("Self Operated");
        System.out.println(" Balance : ");
        System.out.println(savingsAccount.retrieveBalance());
        double debitAmount,creditAmount;
        System.out.println(" Enter amount to be debited : ");
        debitAmount= obj.nextDouble();
        System.out.println(savingsAccount.debitAmount(debitAmount));
        System.out.println(" Enter amount to be credited : ");
        creditAmount= obj.nextDouble();
        System.out.println(savingsAccount.creditAmount(creditAmount));
        System.out.println(" Details : "+ savingsAccount.toString());
    }
}
