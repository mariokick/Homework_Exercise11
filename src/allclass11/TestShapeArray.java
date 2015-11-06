package allclass11;

public class TestShapeArray {
	public static void main(String[]args){
		Shape[] s= new Shape[3];
		s[0] =new Rectangle(10,5);
		s[1] =new Rectangle(20,10);
		s[2] =new Rectangle(40,20);
		double d = ShapeArray.sumArea(s);
		System.out.println(d);
	}
}
