package practiceQues;

//Question is to validate password
// password should be
//Atleast 8 Character
//Atleast 1 Uppercase letter
//Ateleast 1 Lower case letter
//## below is the code to validate the password

public class passwordvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass="nehaKunal2306@";
		System.out.println(valPassword(pass));

	}
	public static  boolean valPassword(String password) {
		
		if(password.length()>7) {
			if(checkPassword(password)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			System.out.println("Too Small");
		}
		return false;
	}
	
	
	
	public static boolean checkPassword(String password) {
		
		boolean hasNum=false;
		boolean hasLower=false;
		boolean hasUpper=false;
		char c;
		
		for(int i=0;i<password.length();i++) 
		{
			c=password.charAt(i);
			if(Character.isDigit(c)) {
				hasNum=true;
			}
			else if(Character.isUpperCase(c)) {
				hasUpper=true;
			}
			else if(Character.isLowerCase(c)) {
				hasLower=true;
			}
			if(hasNum && hasUpper && hasLower) {
				return true;
			}
		}
		return false;
		
	}

}
