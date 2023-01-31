package studentoperation;
import java.util.Scanner;
import java.util.logging.*;
public class Studentoperation
{
	Logger l= Logger.getLogger("com.api.jar");
    Scanner p=new Scanner(System.in);
    String stuname;
    String dob;
    double gpa;
    char gradelevel;
    Studentoperation(String stuname,double gpa,char gradelevel,String dob)
    {
        this.stuname=stuname;
        this.gpa=gpa;
        this.gradelevel=gradelevel;
        this.dob=dob;
    }
    public  void updategpa(){
            double gpa1;
           if(validation()) {
          l.info("Enter yout current GpA:");
           gpa1=p.nextDouble();
              this.gpa=gpa1;
              l.info("GpA Updated Successfully!!!");
        }
        else {
        	l.info("Authentication Failed!!!!1");
        }
    }
    boolean validation()
    {
    	String dobv;
    	l.info("Enter your DOB TO Update GPA");
	    dobv=p.nextLine();
    	try {
    	    Long.parseLong(dobv);
    	}
    	catch(NumberFormatException e)
    	{
    		l.info("DOB SHOUD NOT CONTAIN '.' OR '/' ENTER THE NUMBER ONLY DATEMONTHYEAR");
    	}
    	return (this.dob.equals(dobv));
    }
    String Display()
    {
        return this.stuname+" has a "+Double.toString(this.gpa)+" GPA";
    }
	public static void main(String[] args) {
		Logger l= Logger.getLogger("com.api.jar");
	 Studentoperation a1=new Studentoperation("ganesh",8.0,'B',"20112001");
	 a1.updategpa();
	 l.log(evel.INFO,()->" "+a1.Display());
	}
}
