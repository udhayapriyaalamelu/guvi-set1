package guvi;
import java.util.*;
public class Letterornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
	System.out.println("consonant");
}
else
{
	System.out.println("Invalid");
}
sc.close();
	}

}
