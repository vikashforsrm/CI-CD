package ca.uwo.csd.cs2212.USERNAME;

public class BankAccount {

  private double balance;

  public BankAccount(double balance) {
    this.balance = balance;
//comment added//
//Added one more comment line//
  }

  public double debit(double amount) {
    if (balance < amount) {
      amount = balance;
    }

    balance -= amount;
    return amount;
  }

}
