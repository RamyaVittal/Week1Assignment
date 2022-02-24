package week1;
import java.util.Scanner;

public class SumofDigits {
public void sumDig(int a) {
	int n=0,m;
	while(a!=0) {
		m=a%10;
		n=m+n;
		a=a/10;
	}
	System.out.println(n);
}
/*	if(a<1000&&a>99) 
				int d=a/10;
				int g=a/100;
				System.out.println(a%10+d%10+g%10);
				
	}
}*/
	public static void main(String[] args) {
SumofDigits sod = new SumofDigits();
Scanner scn = new Scanner(System.in);
System.out.println("Enter Integer : ");
int x= scn.nextInt();
sod.sumDig(x);
scn.close();
	}
}
