package allclass11;

public class TestPloymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape shape;
shape = new  Rectangle(10,20); // shape ��ҧ�֧ �׹���
System.out.println(shape.getArea());

shape = new Circle(10); // ��ҧ�֧ǧ���
System.out.println(shape.getArea());
	}

}
