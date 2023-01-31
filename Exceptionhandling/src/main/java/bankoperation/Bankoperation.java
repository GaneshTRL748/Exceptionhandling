package bankoperation;
import java.util.Scanner;
import java.util.logging.*;
public class Bankoperation{
    Scanner p=new Scanner(System.in);
    Logger l= Logger.getLogger("com.api.jar");
    String accname;
    private int pinno;
    long accno;
    double  balance;
    Bankoperation(String accname,long accno,double balance,int pino)
    {
        this.accname=accname;
        this.accno=accno;
        this.balance=balance;
        this.pinno=pino;
    }
    void deposit(double amount)
    {
        if(pinvalidation()){
              this.balance=balance+amount;
              l.info("Amount SuccessFully Credited");
        }
        else{
            l.info("Wrong Pin!!!!!!");
        }
    }
   public  void withdraw(double amount)
    {
    	try {
        if(pinvalidation()){
        if(amount > this.balance)
        {
            l.info(" Insufficient Balance!!!!");
        }
        else{
             this.balance=balance-amount;
             l.info("Amount SuccessFully Debited");
        }
        }
        else{
            l.info("Wrong Pin!!!");
        }
    	}
    	catch(ArithmeticException | NumberFormatException e)
    	{
    		l.info("OOPs something went wrong"+e);
    	}
    	finally {
    		l.info("Last Transaction completed");
    	}
    }
    boolean pinvalidation()
    {
        l.info("Enter your PinNumber:");
        int pinv=p.nextInt();
        return (this.pinno==pinv);
    }
    double balanceamount()
    {
        if(pinvalidation())
        {
          return this.balance;
        }
        else{
            l.info("Wrong Pin!!");
            return 0;
        }
    }
    public static void main(String[] args)
    {
    	 Logger l= Logger.getLogger("com.api.jar");
        Bankoperation a1=new Bankoperation("ganesh",1247170000153950L,200,1685);
        a1.deposit(500);
        a1.withdraw(500);
        l.log(evel.INFO,()->"Hi "+a1.accname+"Your Current balance:"+a1.balanceamount());
        Bankoperation a2=new Bankoperation("Ruby",124717000153951L,5000,1247);
        a2.deposit(2000);
        a2.withdraw(10000);
        l.log(evel.INFO,()->"Hi "+a2.accname+" Your Current balance:"+a2.balanceamount());
    }
}

