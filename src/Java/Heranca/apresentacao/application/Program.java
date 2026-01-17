package Java.Heranca.apresentacao.application;

import Java.Heranca.apresentacao.entities.Account;
import Java.Heranca.apresentacao.entities.BusinessAccount;
import Java.Heranca.apresentacao.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1002, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1001, "Maria", 0.0, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //Downcasting

        BusinessAccount acc4 =  (BusinessAccount) acc2;
        acc4.loan(100.0);

       // BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}
