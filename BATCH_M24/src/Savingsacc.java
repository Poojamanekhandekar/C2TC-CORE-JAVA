
abstract class Savingsacc extends Bankacc{
	   
	//variables
	   private boolean isSalaried;
	   private float MINBAl;
	   
	
		Savingsacc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo,accNm,accBal);//Super used to call superclass constructor
			isSalaried=isSalaried;
	}
		// TODO Auto-generated constructor stub
		public void withdraw() {};
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 