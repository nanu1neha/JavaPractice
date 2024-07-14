package accessModifierDemo;


//Access Modifier
public class Test {

private int a;//PRIVATE
int b;//DEFAULT
public int c;//PUBLIC
void display() {
	System.out.println("Hello World");
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public int getC() {
	return c;
}
public void setC(int c) {
	this.c = c;
}
	
}

class accessModifierDemo{
	public static void main(String[] args) {
		Test test=new Test();
		test.b=2;
		test.c=3;
		System.out.println(test.b);
	}
}
