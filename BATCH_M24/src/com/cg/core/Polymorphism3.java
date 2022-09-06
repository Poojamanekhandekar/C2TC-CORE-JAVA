package com.cg.core;
class Boy{  
void wear(){System.out.println("wearing...");}  
}  
class Amit extends Boy{  
void wear(){System.out.println("wearing Black Shirt...");}  
}  
class Ramesh extends Boy{  
void wear(){System.out.println("wearing White Tshirt...");}  
}  
class Dev extends Boy{  
void wear(){System.out.println("wearing Blue Jeans...");}  
}  


public class Polymorphism3 {

	public static void main(String[] args) {
		Boy a;  
		a=new Amit();  
		a.wear();  
		a=new Ramesh();  
		a.wear();  
		a=new Dev();  
		a.wear();
	}

}