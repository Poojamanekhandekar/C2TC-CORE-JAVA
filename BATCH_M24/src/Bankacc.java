
abstract class Bankacc {
	// variables
	private int accNo;
	private String accNm;
	private float accBal;
	
	//Constructor
	Bankacc(int accNo,String accNm,float accBal){
		//to initialise variables
		accNo=accNo;
		accNm=accNm;
		accBal=accBal;
	}
	//Methods
	@override
	public void withdraw() {}
	public void deposite() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
