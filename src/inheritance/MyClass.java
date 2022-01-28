package inheritance;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle rec = new Rectangle();
Triangle tri = new Triangle();
	
rec.set_values(10,10);
tri.set_values(10, 10);		

System.out.println("Area of rectangle "+rec.area() );
System.out.println("Area of rectangle "+tri.area() );
		
	}

}
