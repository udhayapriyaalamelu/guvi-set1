package guvi;
import java.util.*;
public class Numbernochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
			{
				count++;
			}
			else
				continue;
		}
		System.out.println(count);
	}

}
