package guvi;
import java.util.*;
public class Numberornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
boolean numeric=true;
try {
	Double num=Double.parseDouble(str);
	}
catch(NumberFormatException e)
{
	numeric=false;
}
if(numeric)
{
	System.out.println("Yes");
}
else
	System.out.println("No");
sc.close();
	}

}
