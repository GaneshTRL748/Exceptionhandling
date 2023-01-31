package creditcard;
import java.util.*;
import java.util.logging.*;
public class Creditcardoperation implements Cloneable {
	         Scanner p=new Scanner(System.in);
	         Logger logger= Logger.getLogger("com.api.jar");
            String cardname;
            String cardnumber;
            String expirydate;
            protected Object clone()
            {
            	try {
                   return super.clone();
            	}
            	catch(CloneNotSupportedException e)
            	{
            		logger.info("Oops something went wrong"+e);
            		return "";
            	}
            }
            Creditcardoperation(String cardname,String cardnumber,String expirydate)
            {
            	this.cardname=cardname;
            	this.cardnumber=cardnumber;
            	this.expirydate=expirydate;
            }
            boolean checkcardnumber(String str)
            {
            	if(this.cardnumber.equals(str))
            	{
            		logger.info("Card number verified successfully.......");
            		return true;
            	}
            	else {
            		logger.info("OOPs wrong card number");
            		return false;
            	}
            }
            public static void main(String[] args) 
            {
            	Logger logger= Logger.getLogger("com.api.jar");
            	Creditcardoperation a1=new Creditcardoperation("ganesh","124717","12.11.2027");
            	Creditcardoperation a2=(Creditcardoperation)a1.clone();
            	logger.log(evel.INFO,()->"Cloned Details:\ncardnumber:"+a2.cardnumber+"\ncardname:"+a2.cardname+"\nexpirydate:"+a2.expirydate);
            	logger.log(evel.INFO,()->"verification status:"+a1.checkcardnumber(a2.cardnumber));
            }
}
