package ExceptionHandling3;

public interface SavingAccount {
	public void deposite(double amount) throws IllegalBankTransactionExpection;
	public double withdraw(double amount) throws InsufficientBalanceException;
	public void balanceEnquiry();

}
