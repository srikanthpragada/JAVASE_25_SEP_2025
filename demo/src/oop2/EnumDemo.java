package oop2;

enum PaymentModes  {
	CASH, CARD, UPI, NEFT 
}

public class EnumDemo {

	public static void main(String[] args) {
		 PaymentModes pm;
		 
		 pm = PaymentModes.CARD;
		 
		 System.out.println(pm);
		 
		 if(pm == PaymentModes.CASH)
			 System.out.println("Cash Payment");
		 else
			 System.out.println("Non-Cash Payment");
      
	}

}
