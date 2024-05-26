package bank;

import bank.exceptions.AmountException;

public class Account {
  private int id;
  private String type;
  private double balance;

  // Constructor: Used to initialize object by setting there state
  public Account(int id, String type, double balance) {
    setId(id);
    setType(type);
    setBalance(balance);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) throws AmountException{
    if (amount < 1) {
      throw new AmountException("The minimum deposite us 1.00"); 
    }
    else{
      double newBalnace = balance + amount;
      setBalance(newBalnace);
      DataSource.updateAccountBalance(id, newBalnace);
    }
  }

  public void Withdraw(double amount) throws AmountException{
    if(amount < 0){
      throw new AmountException(("The withdrala amount must be greater than 0."));
    }else if(amount >getBalance()){
      throw new AmountException("You do not have sufficient funds for this withdrawal");
    }else{
      double newBalnace = balance - amount;
      setBalance(newBalnace);
      DataSource.updateAccountBalance(id, newBalnace);
    }
  }

}
