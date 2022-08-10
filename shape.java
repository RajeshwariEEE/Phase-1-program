package Assistedprogram1;

public class shape {
	double length;
	double breadth;
    double radius;
    double rh;
    double tr;
    double side;
    static double pi;
	public shape() {
		System.out.println("Inside the constructor");
		pi=3.14;
	}
	shape(float b)
	{
		side=b;
	}
	shape(float l,int b)
	{
		length=l;
		breadth=b;
	}
	shape(int r)
	{
		radius=r;
	}
	
	void displaysquare()
	{
		System.out.println("Area of square is: "+(side*side));
	}
	void displayrectangle()
	{
		System.out.println("Area of rectangle is: "+(length*breadth));
	}
	void displaycircle()
	{
		System.out.println("Area of circle is: "+(pi)*radius*radius);
		System.out.println(pi);
	}
	
	public void Area(int p,int q)
	{
		rh=(p*q)/2;
		System.out.println("Area of rhombus is: "+rh);
	}
	public void Area(long h,float b)
	{
		tr=(h*b)/2;
		System.out.println("Area of triangle is: "+tr);
	}
	
public static void main(String[] args) {
	//object creation
			shape s=new shape();
			shape s1=new shape(37.4f);         //passing parameters for constructor
			shape s2=new shape(4.5f,6);
			shape s3=new shape(6);
			
			s1.displaysquare();            //calling the display function for square
			s2.displayrectangle();         //calling the display function for rectangle
			s3.displaycircle();
			
			s.Area(5, 4);
			s.Area(30, 23.4f);
		}

}
		