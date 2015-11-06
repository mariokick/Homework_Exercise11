package allclass11;

public class Rectangle extends Shape{//���� �����������׹��� �׺�ʹ�ҡ Shape 
private double width;
private double height;
public Rectangle(double width2 , double height2 ){ //����ö�Ѻ������ͧ��� ��������¡��� ����.Rectangle(4,2); �˹��˹ѧ��� 
	//��˹���int �����ͧ�ҡ clone �е�ͧ �ժ�Դ����÷������͹�Ѻ��ǵ鹨֧��˹�double᷹
	width =width2;   //w =4 ���� ��� width = 4 
	height= height2; // h=2 ������� height =2
}
public double getWidth(){ //�ͧ���ʹ�����������¡�� ����.getWidth(4); ���觤�� 4 ��价�� double width ;
	return width ; 
}
public double getHeight(){
	return height ;
}
//��������ô� getArea()��� toString()
public double getArea(){
	return width * height; 
}
//tostring();
public String toString(){// �ӧҹ����͹ System.out.print(); ᵡ��ҧ��� �����sys �ʴ����ʹ�µç�ҡ���ʹ������� ��tostring����ö�ʴ��� �¨��红�ͤ���  
	String str = "Rectangle"; // �ʴ� �� ���ҧ ��� ��鹷�� 㹤��������
	str +=" color="+ getColor();
	str +=" width="+ width;
	str +=" height=" +height;
	str +=" area=" +getArea();
	return str; // 
}
//toString ��ʵ�ԧ�ʴ������ѵ�ط��ʹ�
//equals()�����º��º������ҡѹ�ͧ�ѵ�� 
public boolean equals(Object otherObject){
	if(!(otherObject instanceof Rectangle)){ //��Ǩ�ͺ��� �Ϳ������� ������������鹼���������繨е�Ǩ�ͺ�������ҧ����٧ ������������������ҡѹ���
		return false;
	}
	Rectangle otherRect = (Rectangle) otherObject;
	boolean equalWidth = width == otherRect.width; // ��Ǩ�ͺ������ҡѹ�ͧ��ҹ���ҧ
	boolean equalHeight = height == otherRect.height;// ��Ǩ�ͺ��ҹ���
	return equalWidth && equalHeight;
	
}
//clone()���Ź����ѵ�� ����Ź�����ѡɳ�����͹�Ѻ��Ǩ�ԧ�ء��С�� 
public Object clone(){
	Rectangle clone = new Rectangle(width, height);
	return clone;
}
//hashCode()���觨ӹǹ�������������Ϊ���ʴѧ����Ƕ١������Ѻ��ä������ҧ�Ǵ����
public int hashCode(){
	return(int) (width + height * 17);
	//�׹��� �繨ӹǹ��� ��� ���������������ҡѹ�Ф׹��ҷ���ҧ�͡�
}
}
