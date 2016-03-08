package Triangle;

/** Begin Main */
public class Triangle extends GeometricObject{
	
	/** Define Default Side Lengths */
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	/** No-arg Constructor */
	public Triangle(){
	}
	
	/** Constructor */
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/** Accessor methods */
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	/** Perimeter of Triangle */
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	
	/** Area of Triangle */
	public double getArea(){
		
		double hP = getPerimeter()/2;
		
		return (Math.sqrt(hP * (hP - side1) * (hP - side2) * (hP - side3)));
	}
	
	/** Description of Triangle */
	public String toString(){
		return("|Length of Side 1 = " + side1 + " |Length of Side 2 = " + side2 +
				" |Length of Side 3 = " + side3 + "\n The area of the triangle is" 
				+ getArea() + "\n The perimeter of the triangle is" + getPerimeter());
		
	}
}/** End Main */