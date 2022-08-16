public class SavingsAccount {
    private String customerName;
    private int accountNumber;
    private String accountOpeningDate;
    private Boolean accountStatus;
    private double availableBalance;
    private double totalBalance;
    private String onlineBankingStatus;
    private double interestRate;
    private String modeOfAccountOperation;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public Boolean getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getOnlineBankingStatus() {
        return onlineBankingStatus;
    }

    public void setOnlineBankingStatus(String onlineBankingStatus) {
        this.onlineBankingStatus = onlineBankingStatus;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getModeOfAccountOperation() {
        return modeOfAccountOperation;
    }

    public void setModeOfAccountOperation(String modeOfAccountOperation) {
        this.modeOfAccountOperation = modeOfAccountOperation;
    }

    public double retrieveBalance()
    {
      //  double availbal =
        return availableBalance;
    }
    public double debitAmount(double debitAmount)
    {
        return this.availableBalance-debitAmount;
    }
    public double creditAmount(double creditAmount)
    {
        return this.availableBalance+creditAmount;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "customerName='" + customerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountOpeningDate='" + accountOpeningDate + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                ", availableBalance=" + availableBalance +
                ", totalBalance=" + totalBalance +
                ", onlineBankingStatus='" + onlineBankingStatus + '\'' +
                ", interestRate=" + interestRate +
                ", modeOfAccountOperation='" + modeOfAccountOperation + '\'' +
                '}';
    }

}
