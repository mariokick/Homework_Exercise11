package allclass11;

public class Circle extends Shape {
protected double radius;
public Circle(double r ){
	radius= r;
	
}
public double getRadius(){
	return radius;
}
public double getArea(){//พื้นที่ วงกลม
	return Math.PI *radius * radius; // ค่าพายยยย
	
}
}
