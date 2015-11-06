package allclass11;

public class TestPloymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape shape;
shape = new  Rectangle(10,20); // shape อ้างถึง ผืนผ้า
System.out.println(shape.getArea());

shape = new Circle(10); // อ้างถึงวงกลม
System.out.println(shape.getArea());
	}

}
