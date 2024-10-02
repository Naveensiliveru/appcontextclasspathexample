package in.ashokit.beans;

public class CreditCard  implements IPayment{
	

	public CreditCard() {
System.out.println(" Creditcard Constuctor :: Constructor");
		
	}

	public boolean processPayment(double billAmt) {
	System.out.println("CreditCard payment is sucessful");
	return true;
		
	}

}
