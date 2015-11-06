package allclass11;

public class Square extends Rectangle{ //สืบทอด เหลี่ยมผืนผ้า
public Square(double w){
	super(w,w);
	//เรียกใช้คอนสตรักเตอร์นคลาสแม่
}
public String toString(){// ทำงานเหมือน System.out.print(); แตกต่างที่ ถ้าใช้sys แสดงเมธอดโดยตรงจากคลาสนี้ไม่ได้ แต่tostringสามารถแสดงได้ โดยจะเก็บข้อความ  
	String str = "Square"; // แสดง สี กว้าง ยาว พื้นที่ ในคำสั่งเดียว
	str +=" id="+ getColor(); //จากคลาสรูปร่าง
	str +=" width="+ getWidth();//จาก ผืนผ้า
	str +=" area=" +getArea();//จากผืนผ้า
	return str; // 
}
}
