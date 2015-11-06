package Exercise11_08;

public class Student extends Person {
	private String Major="";
void setMajor(String s ){
	Major = s;
	
}
public String toString(){
	String str = new String();
str +=" Name=" + getName();
str +=" Major="+ Major;
return str;
}
}
