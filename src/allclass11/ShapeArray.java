package allclass11;

public class ShapeArray {
public static double sumArea(Shape[] shapes){//รวมพื้นที่
	double sum= 0 ; 
	for(Shape s : shapes){
		sum+=s.getArea();
	}
	return sum;
}

}
