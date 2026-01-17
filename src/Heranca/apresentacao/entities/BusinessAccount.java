package Heranca.apresentacao.entities;

import javax.swing.plaf.nimbus.NimbusStyle;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(String number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if(amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
}
