package oopsConcepts;
//Implementation of encapsulation
class savingAccount{
	
	private int accNo;
	
	void setAccno(int x) {
		accNo=x;
	}
	int getAccno() {
		return accNo;
	}
}

public class encapsulationDemo {

	public static void main(String[] args) {
		savingAccount ob= new savingAccount();
		ob.setAccno(123);
		System.out.println(ob.getAccno());
		

	}

}
