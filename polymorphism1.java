/*
Program where calculate() method of super class is overriden by calculate() methodof sub class  
*/
//Dynamic polymorphism(method overriding)
import java.io.*;

class One{
	void calculate(double x)
	{
		System.out.println("square of given  numbers:"+(x*x));
	}
}
class Two extends One{
	void calculate(double x)
	{
	//	super.calculate(x);	
		System.out.println("square root of given  numbers:"+Math.sqrt(x));
	}
}


class polymorphism1{
public static void main(String args[]){
	Two t=new Two();
	t.calculate(25);		
	
}
}
