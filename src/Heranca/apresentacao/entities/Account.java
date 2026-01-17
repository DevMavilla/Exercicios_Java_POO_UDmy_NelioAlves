package Heranca.apresentacao.entities;

public class Account {
    private String number;
    private String holder;
    protected Double balance;

    public Account(){
    }

    public Account(String number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void whithdraw(Double amount){
         balance -= amount;
    }

    public void deposit(Double amount){
        balance += amount;
    }
}
