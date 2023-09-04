package ait.bank;

import ait.bank.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {
        BankAccount acc0 = new BankAccount(1000, "Peter", "ABC", 100, 100);
        System.out.println(acc0.getBalance());
    }
}
