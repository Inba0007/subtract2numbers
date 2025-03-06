
import java.util.Scanner;

public class multiply3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,mutliply;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the first number(a)");
		a=obj.nextInt();
		System.out.println("enter the second number(b)");
		b=obj.nextInt();
		System.out.println("enter the third number(c)");
		c=obj.nextInt();
	    mutliply=a*b*c;
		System.out.println("answer"+" "+mutliply);
	}

}