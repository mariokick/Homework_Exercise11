package allclass11;

public class Circle extends Shape {
protected double radius;
public Circle(double r ){
	radius= r;
	
}
public double getRadius(){
	return radius;
}
public double getArea(){//��鹷�� ǧ���
	return Math.PI *radius * radius; // ��Ҿ�����
	
}
}
