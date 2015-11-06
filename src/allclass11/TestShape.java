package allclass11;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape a1= new Shape(); // เรียกใช้class Shape ในชื่อที่เรียก a (สร้างรูปร่าง)
	System.out.println(a1.getColor());// แสดงสีปัจจุบัน
	System.out.println(a1.getArea()); //แสดงพื้นที่ 
	
	Shape a2 = new Shape();
	a2.setColor(Color.Red);// เปลี่ยนสีเป็นRed Color.Red หมายถึง อ้างอิงจาก enum Color 
	System.out.println(a2.getColor());//แสดงสีปัจจุบัน
	System.out.println(a2.getArea());//แสดงพื้นที่
	Rectangle b1 = new Rectangle(4,2); //ถ้าไม่ใส่เลขจะรันไม่ผ่าน เพราะมันรับสองค่า
	System.out.println(b1.toString()); // การใช้งาน  tostring เพื่อบอกข้อมูลต่างๆของ สีเหลี่ยม

	
	}

}
