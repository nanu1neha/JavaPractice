package oopsConcepts;
class Shape{
	double calArea(int a) {
		return a*a;
	}
	double calArea(int a,int b) {
		return a*b;
	}
	double calArea(double a) {
		return 3.14*a;
	}
	
}

public class methodOverloadingDemo {

	public static void main(String[] args) {
		Shape ob=new Shape();
		System.out.println("Area: "+ob.calArea(3));
		System.out.println("Area: "+ob.calArea(3,4));
		System.out.println("Area: "+ob.calArea(3.5));
		
		

	}

}
