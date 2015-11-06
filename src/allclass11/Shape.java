package allclass11;
//คลาสรูปร่าง
public class Shape {
	
private Color color;//เรียกใช้ Enum ที่ประกาศไว้ ชือColor เวลาเรียก ใช้คำว่า color 	
public double getArea(){ //เมธอด คำนวนหาพื้นที่รูปร่าง เนื่องจากยังไม่ทราบว่ารูปอะไร จึงส่้งค่า=0ไปก่อน
	return 0 ;
}
public Shape(){
	color=Color.Green; //รูปร่างทั่วไปมีสีเขียว
}
public void setColor(Color c){ // เมธอดเปลี่ยนสี เวลาเรียกใช้ก็ ชื่อ.setColor(Red); เปลี่ยนเปนสีแดง
	color = c ; 
}
public Color getColor(){  // ส่ง สี ปัจจุบันที่เก็ฐไว้ในนาม color
	return color;
}

}
