package allclass11;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape a1= new Shape(); // ���¡��class Shape 㹪��ͷ�����¡ a (���ҧ�ٻ��ҧ)
	System.out.println(a1.getColor());// �ʴ��ջѨ�غѹ
	System.out.println(a1.getArea()); //�ʴ���鹷�� 
	
	Shape a2 = new Shape();
	a2.setColor(Color.Red);// ����¹����Red Color.Red ���¶֧ ��ҧ�ԧ�ҡ enum Color 
	System.out.println(a2.getColor());//�ʴ��ջѨ�غѹ
	System.out.println(a2.getArea());//�ʴ���鹷��
	Rectangle b1 = new Rectangle(4,2); //����������Ţ���ѹ����ҹ �����ѹ�Ѻ�ͧ���
	System.out.println(b1.toString()); // �����ҹ  tostring ���ͺ͡�����ŵ�ҧ�ͧ ���������

	
	}

}
