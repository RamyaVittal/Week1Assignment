package week1;
import java.util.Scanner;

public class MyCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator cal = new Calculator();
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 values for Addition:");
cal.add(sc.nextInt(), sc.nextInt(),sc.nextInt());
System.out.println("Enter 2 values for Sub:");

cal.sub(sc.nextInt(), sc.nextInt());
System.out.println("Enter 2 values for Mul:");

cal.mul(sc.nextDouble(),sc.nextDouble());
System.out.println("Enter 2 values for Div:");

cal.div(sc.nextFloat(),sc.nextFloat());
sc.close();
	}

}
