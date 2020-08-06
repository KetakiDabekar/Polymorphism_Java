/*
Program to create sample class with  2 methods with same name and different signature
*/
//Dynamic polymorphism(method overloading)
import java.io.*;

class Sample{
	void Add(int a,int b)
	{
		System.out.println("Addition of two intger numbers:"+(a+b));
	}
	void Add(int a,int b,int c)
	{
		System.out.println("Addition of three intger numbers:"+(a+b+c));
	}
}

class polymorphism{
public static void main(String args[]){
	Sample s=new Sample();
	s.Add(10,20);		//call bound with fisrt method
	s.Add(10,20,30);	//call bound with second method
}
}
