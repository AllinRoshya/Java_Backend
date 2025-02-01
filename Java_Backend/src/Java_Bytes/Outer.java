package Java_Bytes;

public class Outer {
void display() {
	System.out.println("Outer method");
}
class Inner{
	void display() {
		System.out.println("Inner Method");
	}
}
	public static void main(String[] args) {
Outer out=new Outer();
Outer.Inner inner=out.new Inner(); 
inner.display();
out.display();
	}

}
