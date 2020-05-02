
public class Triangle {
	double aLength, bLength, cLength;
	public Triangle(double a, double b, double c) {
		aLength = a;
		bLength = b;
		cLength = c;
	}
    
	public double getPerimeter() {
		return aLength + bLength + cLength;
	}
	
	public double getArea() {
		double p =  ((aLength + bLength + cLength)/2.0);
		return Math.sqrt(p*(p-aLength)*(p-bLength)*(p-cLength));
	}
}
