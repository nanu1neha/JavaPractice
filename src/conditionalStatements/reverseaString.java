package conditionalStatements;

public class reverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123";
		System.out.println(reverseAnString(str));
	}
	
	public static   String reverseAnString(String in){
		
		if(in==null) {
			throw new IllegalArgumentException("Null is not a valid input");
		}
			StringBuilder out=new StringBuilder();
			
			char[] chars=in.toCharArray();
			for(int i= chars.length-1;i>=0;i--) {
				out.append(chars[i]);
				
			}
		
		return out.toString();
		
	}
	

	}
