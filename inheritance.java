
import java.util.Date;

class BankAccount{
    private String acctnum;
    private double balance;

    public void setAcctnum(String acctnum) {
        this.acctnum = acctnum;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAcctnum() {
        return acctnum;
    }
}
class CheckingAccount extends BankAccount{
    private double limit;

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }
}
class COD extends BankAccount{
    Date expiry;

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public Date getExpiry() {
        return expiry;
    }
}

public class TestingInheritance {
        public static void main (String[] args){
            CheckingAccount x = new CheckingAccount();
            x.setLimit(9000);
            System.out.println(x.getLimit());
            x.setAcctnum("123HAHAHA");
            System.out.println(x.getAcctnum());
            x.setBalance(123.12);
            System.out.println(x.getBalance());

        }
    }

