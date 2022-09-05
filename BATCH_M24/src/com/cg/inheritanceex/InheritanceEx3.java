package com.cg.inheritanceex;
class bank1loan{  
void Intrest(){System.out.println("2%");}  
}  
class PersonalLoan1 extends bank1loan{  
void IntrestPL(){System.out.println("5%");}  
}  
class Carloan extends bank1loan{  
void IntrestCL(){System.out.println("8%");}  
}  

public class InheritanceEx3 {

	public static void main(String[] args) {
		Carloan c=new Carloan();  
		c.IntrestCL();  
		c.Intrest(); 

	}

}
//When two or more classes inherits a single class, it is known as hierarchical inheritance.  
