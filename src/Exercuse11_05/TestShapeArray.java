package Exercuse11_05;

import allclass11.Rectangle;
import allclass11.Shape;
import allclass11.ShapeArray;

public class TestShapeArray {
//��� �����������׹��� ��� 6 -7 ����͹�ѹ �����ٻ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s= new Shape[3];
		s[0] =new Rectangle(10,5);
		s[1] =new Rectangle(20,10);
		s[2] =new Rectangle(40,20);
		double d = ShapeArray.sumArea(s);
		System.out.println(d);
	}
}
