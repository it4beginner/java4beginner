import java.util.Scanner; 
public class ReadInput {
	public static void main(String[] args) {
		// Using Scanner for Getting Input from User 
        Scanner in = new Scanner(System.in);  
        // here we read one integer
		int aLength = in.nextInt();
		int bLength = in.nextInt();
		int cLength = in.nextInt();
		System.out.println("aLength " + aLength + " bLength " + bLength + " cLength " + cLength);
		double p =  ((aLength + bLength + cLength)/2.0);
		System.out.println("p is " + p);
		double area = Math.sqrt(p*(p-aLength)*(p-bLength)*(p-cLength));
		System.out.println("area is " + area);
	}
}
