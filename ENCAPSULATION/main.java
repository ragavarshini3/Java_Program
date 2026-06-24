package Encapsulation;
import java.util.*;
public class main {
	public static void main (String[] main) {
		
		
		ATM atm1 = new ATM();
		atm1.CustName = "VARSHINI";
		atm1.MobileNo = 123456;
		atm1.AcctBal = 1000;
		
		System.out.println("Customer Name :"
		+atm1.CustName);
		System.out.println("Customer Acct Bal :" + atm1.AcctBal);
	}
}
