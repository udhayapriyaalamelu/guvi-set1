package guvi;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int org=num;
int rem=0,result=0;
while(num!=0)
{
	rem=num%10;
	result+=rem*rem*rem;
	num/=10;
}
if(org==result)
	System.out.println("Yes");
else
	System.out.println("No");
sc.close();
	}

}
