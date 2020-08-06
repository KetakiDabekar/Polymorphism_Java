/*
Program  to use super class reference to call calculate() method.  
*/
//Static polymorphism polymorphism(method overriding)
import java.io.*;

class One{
	static void calculate(double x)
	{
		System.out.println("square of given  numbers:"+(x*x));
	}
}
class Two extends One{
	static void calculate(double x)
	{
	//	super.calculate(x);	
		System.out.println("square root of given  numbers:"+Math.sqrt(x));
	}
}


class StaticMethod{
public static void main(String args[]){
	One o=new Two();	//super class reference refers to sub class obj.
	o.calculate(25);	//call calculate() using super class reference.
//	Two t= new Two();
//	t.calculate(25);	
}
}
