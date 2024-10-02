package in.ashokit.beans;

public class PaymentService {

	private IPayment payment;

	public PaymentService() {
		System.out.println("zero para constructor");

	}

	public PaymentService(IPayment payment) {
		this.payment = payment;
	}

	public void setPayment(IPayment payment) {
		System.out.println("this  is  setter method");
		this.payment = payment;
	}
	

	
	

	public void doPayment(double billAmt) {
		boolean status = payment.processPayment(billAmt);
		if (status) {
			System.out.println(" Recipt is printing ");
		} else {
			System.out.println(" card is declined");
		}

	}

}
