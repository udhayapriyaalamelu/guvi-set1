package guvi;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int count=0;
for(int i=2;i<=num/2;i++)
{
	count=0;
		if(num%i==0)
		{
			count++;
			break;
		}
	}
if(count==0)
	System.out.println("yes");
else
	System.out.println("No");
sc.close();
	}

}
