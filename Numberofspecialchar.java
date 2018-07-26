package guvi;
import java.util.*;
public class Numberofspecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
int count=0;
for(int i=0;i<s1.length();i++)
{
	if((s1.charAt(i)>='0'&&s1.charAt(i)<='9')||
			(s1.charAt(i)>='a'&&s1.charAt(i)<='z')||
			(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')||s1.charAt(i)==' ')
	{
		continue;
	}
	else
	{
		count++;
	}
	
}
System.out.println(count);
	}

}
