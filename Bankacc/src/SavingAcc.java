
abstract class SavingAcc
extends BankAcc{
	private boolean isSalaried;
	private static float MINBAL;
	public SavingAcc(int accNo,String accNm,int accBal,boolean isSalaried) {
		super(accNo,accNm,accBal);
		
	}
	public String tostring() {
		return null;
	}
}