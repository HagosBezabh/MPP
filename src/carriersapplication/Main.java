package carriersapplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		System.out.println("Enter the weight and zone of the package and who is the sender");
		double j=getDouble();
		String zone=getString();
		String sender=getString();
	
	Ups ups=new Ups(j,sender);
	UsMail mail=new UsMail(j,sender);
	Fedex fed=new Fedex(j,zone,sender);
	Common com = new Common(ups,mail,fed);
	System.out.println("The lowest price is "+com.getObject().getCost()+" through "+
	com.getObject().getName());
	//com.getObject().getCost()
		
	}
	public static double getDouble() throws IOException  //reads a string from the keyboard input
    {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return (Double.valueOf(s)).doubleValue();
    }
	public static String getString() throws IOException  //reads a string from the keyboard input
    {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
    }
}
