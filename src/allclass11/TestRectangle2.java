package allclass11;

public class TestRectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1 =new Rectangle(2,5);//������������ 1
System.out.println(r1);
System.out.println(r1.hashCode()); //87

Rectangle r2 =new Rectangle(5,2);//������������ 2 �����ҡѺ��������á
System.out.println(r1.equals(r2));//������ͺ��� ��������������ҡѹ������� r1 ��º r2

Rectangle r3 = (Rectangle) r1.clone(); //�Ź��� r1 �������¡��ҧ�Ź��� r3
System.out.println(r1.equals(r3)); //r1��º r3 
//trun = ��ҡѹ false ������ 


	}

}
