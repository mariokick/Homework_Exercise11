package allclass11;

public class TestRectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1 =new Rectangle(2,5);//ไอเหลี่ยมที่ 1
System.out.println(r1);
System.out.println(r1.hashCode()); //87

Rectangle r2 =new Rectangle(5,2);//ไอเหลี่ยมที่ 2 ไม่เท่ากับเหลี่ยมแรก
System.out.println(r1.equals(r2));//เตรียมสอบว่า คู่หูเหลี่ยมเท่ากันหรือไม่ r1 เทียบ r2

Rectangle r3 = (Rectangle) r1.clone(); //โคลนนิ่ง r1 แล้วเรียกร่างโคลนว่า r3
System.out.println(r1.equals(r3)); //r1เทียบ r3 
//trun = เท่ากัน false ไม่เท่า 


	}

}
