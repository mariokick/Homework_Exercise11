package allclass11;

public class Rectangle extends Shape{//คลาส สี่เหลี่ยมผืนผ้า สืบทอดจาก Shape 
private double width;
private double height;
public Rectangle(double width2 , double height2 ){ //สามารถรับค่าได้สองค่า คำสั่งเรียกคือ ชื่อ.Rectangle(4,2); ในหน้าหนังสือ 
	//กำหนดเป็นint แต่เนื่องจาก clone จะต้อง มีชนิดตัวแปรที่เหมือนกับตัวต้นจึงกำหนดdoubleแทน
	width =width2;   //w =4 แล้ว ให้ width = 4 
	height= height2; // h=2 แล้วให้ height =2
}
public double getWidth(){ //สองเมธอดนี้เมื่อเรียกใช้ ชื่อ.getWidth(4); จะส่งค่า 4 ส่งไปที่ double width ;
	return width ; 
}
public double getHeight(){
	return height ;
}
//โอเวอร์ไรด์ getArea()และ toString()
public double getArea(){
	return width * height; 
}
//tostring();
public String toString(){// ทำงานเหมือน System.out.print(); แตกต่างที่ ถ้าใช้sys แสดงเมธอดโดยตรงจากคลาสนี้ไม่ได้ แต่tostringสามารถแสดงได้ โดยจะเก็บข้อความ  
	String str = "Rectangle"; // แสดง สี กว้าง ยาว พื้นที่ ในคำสั่งเดียว
	str +=" color="+ getColor();
	str +=" width="+ width;
	str +=" height=" +height;
	str +=" area=" +getArea();
	return str; // 
}
//toString ส่งสตริงแสดงค่าในวัตถุที่สนใจ
//equals()ใช้เปรียบเทียบความเท่ากันของวัตถุ 
public boolean equals(Object otherObject){
	if(!(otherObject instanceof Rectangle)){ //ตรวจสอบว่า ออฟเจ็กอื่นเป็ สี่เหลี่ยมพื้นผ้าไหมถ้าเป็นจะตรวจสอบความกว้างและสูง ถ้าไม่เป็นแปลว่าไม่เท่ากันแน่ๆ
		return false;
	}
	Rectangle otherRect = (Rectangle) otherObject;
	boolean equalWidth = width == otherRect.width; // ตรวจสอบความเท่ากันของด้านกว้าง
	boolean equalHeight = height == otherRect.height;// ตรวจสอบด้านยาว
	return equalWidth && equalHeight;
	
}
//clone()ใช้โคลนนิ่งวัตถุ ตัวโคลนจะมีลักษณะเหมือนกับตัวจริงทุกประการ 
public Object clone(){
	Rectangle clone = new Rectangle(width, height);
	return clone;
}
//hashCode()จะส่งจำนวนเต็มที่เป็นรหัสแฮชรหัสดังกล่าวถูกใช้สำหรับการค้นหาอย่างรวดเร็ว
public int hashCode(){
	return(int) (width + height * 17);
	//คืนค่า เป็นจำนวนเต็ม ถ้า สี่เหลี่ยมไม่เท่ากันจะคืนค่าที่ต่างออกไป
}
}
