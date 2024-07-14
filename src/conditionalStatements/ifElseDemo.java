package conditionalStatements;
import java.util.Scanner;
public class ifElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please Enter your Age:");
		int age= in.nextInt();
		if(age>=60) {
			System.out.println("You are a Senior Citizen");
		}
		else if (age >=18) {
			System.out.println("You are Eligible to Vote!!");
			
		}
		else {
			System.out.println("You are Not Eligible to Vote!!!");
		}

	}

}
