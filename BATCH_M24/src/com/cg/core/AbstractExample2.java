package com.cg.core;
abstract class MyVehicle
{  
    abstract void bike();  

    void car()  
    {  
        System.out.println("Car is running");  
    }  

}  
class Tata extends MyVehicle  
{  


    void bike() {  
        System.out.println("Bike is running");  

    }  

}  
public  class AbstractExample2 {

	public static void main(String[] args) {
	    Tata obj=new Tata();  
	    obj.bike();  
	    obj.car();  

	}

}
//Abstract class containing the abstract and non-abstract method 


	