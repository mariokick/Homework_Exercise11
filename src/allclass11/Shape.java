package allclass11;
//�����ٻ��ҧ
public class Shape {
	
private Color color;//���¡�� Enum ����С����� ���Color �������¡ ������ color 	
public double getArea(){ //���ʹ �ӹǹ�Ҿ�鹷���ٻ��ҧ ���ͧ�ҡ�ѧ����Һ����ٻ���� �֧��駤��=0仡�͹
	return 0 ;
}
public Shape(){
	color=Color.Green; //�ٻ��ҧ�������������
}
public void setColor(Color c){ // ���ʹ����¹�� �������¡��� ����.setColor(Red); ����¹໹��ᴧ
	color = c ; 
}
public Color getColor(){  // �� �� �Ѩ�غѹ��������㹹�� color
	return color;
}

}
