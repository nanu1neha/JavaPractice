package conditionalStatements;
import java.util.Scanner;
public class evenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=reader.nextInt();
		
		if(num %2==0) {
			System.out.println("Number is Even");
			
		}
		else {
			System.out.println("Number is Odd");
		}

	}

}
