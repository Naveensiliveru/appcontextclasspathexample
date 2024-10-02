package in.ashokit.beans;

public class DebitCard implements IPayment {

	public boolean processPayment(double billAmt) {
	System.out.println("DebitCard payment is sucessful");
	return true;
		
	}

}
