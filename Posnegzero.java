package guvi;
import java.util.*;
public class Posnegzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num>0)
{
	System.out.println("Positive");
}
else if(num<0)
{
	System.out.println("Negative");
}
else
{
	System.out.println("Zero");
}
sc.close();
	}

}
