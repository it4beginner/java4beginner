import java.util.Vector;

public class JavaVector {

	public static void main(String[] args) {
        Vector<Integer> myData = new Vector();
        myData.add(1);
        myData.add(2);
        myData.add(3);      
        for(int ii=0; ii<myData.size(); ii++) {
        	System.out.println(myData.get(ii));
        }
        	
	}

}
