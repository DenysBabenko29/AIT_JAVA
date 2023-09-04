package ait.bank.model;

import java.util.Objects;

public class Account {
    int accNumber;
    int balance;

    public Account(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getAccNumber() {
        return accNumber;
    }


    public int getBalance() {
        return balance;
    }

    public  void debit(int sum){
        balance -= sum;
    }
    public  void credit(int sum){
        balance += sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accNumber == account.accNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accNumber);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("accNumber= ");
        sb.append(accNumber);
        sb.append(", balance= ").append(balance);
        return sb.toString();
    }
}
