import java.util.*;

class typeConversion{
	public static void main(String args[]){
		int a=5;
		float b=10.0f;
		System.out.println("Before type promotion:\ta="+a+"\tb="+b);
		a=(int)b;
		System.out.println("After type promotion:\ta="+a+"\tb="+b);


		int c=1000;
		byte d=0;
		System.out.println("Before type casting:\tc="+c+"\td="+d);
		d=(byte)c;
		System.out.println("After type casting:\tc="+c+"\td="+d);
}}

		