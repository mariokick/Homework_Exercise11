package allclass11;

public class Square extends Rectangle{ //�׺�ʹ ��������׹���
public Square(double w){
	super(w,w);
	//���¡��͹ʵ�ѡ���칤������
}
public String toString(){// �ӧҹ����͹ System.out.print(); ᵡ��ҧ��� �����sys �ʴ����ʹ�µç�ҡ���ʹ������� ��tostring����ö�ʴ��� �¨��红�ͤ���  
	String str = "Square"; // �ʴ� �� ���ҧ ��� ��鹷�� 㹤��������
	str +=" id="+ getColor(); //�ҡ�����ٻ��ҧ
	str +=" width="+ getWidth();//�ҡ �׹���
	str +=" area=" +getArea();//�ҡ�׹���
	return str; // 
}
}
