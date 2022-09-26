class Main{
	public static void main (String args[]) {
		BankFactory pbj=new
				MMBankFactory();
		SavingAcc obj1=new
				MMSavingAcc(0,null,0,false);
		CurrentAcc obj2=new
				MMCurrentAcc(0,null,0,0);
		obj1.withdraw();
		obj2.toString();
				
	}
}