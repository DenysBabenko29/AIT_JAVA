package ait.bank.model;

public class BankAccount {
    private long account;
    private String owner;
    private String bank;
    private int branch;
    private double balance;

    public BankAccount(long account, String owner, String bank, int branch, double balance) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }

    public long getAccount() {
        return account;
    }

    public String getOwner() {
        return owner;
    }

    public String getBank() {
        return bank;
    }

    public int getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }


    public void setOwner(String owner) {
        this.owner = owner;
    }


    public void setBranch(int branch) {
        this.branch = branch;
    }
    public void deposit(double sum){
        balance += sum;
    }
    public boolean withDraw(double sum){
        if (balance >= sum){
            balance -= sum;
            return true;
        }
        return false;
    }
}
