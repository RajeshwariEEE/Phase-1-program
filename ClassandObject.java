package Assitedprogram2;

public class ClassandObject {
double areaOfCircle;
	
	public double area(int a,int b)
	{
		areaOfCircle=a*b*3.14;
		return areaOfCircle;
	}

	public static void main(String[] args) {
ClassandObject c=new ClassandObject();      //Object creation 
		
		System.out.println(c.area(2,3));
	}


}
