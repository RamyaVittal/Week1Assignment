package week1;

public class Calculator {

	public int add(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Sum is"+ d);
		return d;
	}
	public int sub(int a, int b) {
		
		int d = a - b;
		System.out.println("Difference is"+d);

		return d;
	}
	public double mul(double a, double b) {
		double d = a*b;
		System.out.println("mutiplication is"+d);

		return d;
	}
	public float div(float a, float b) {
		float d = a/b;
		System.out.println("division is"+d);

		return d;
	}




}
