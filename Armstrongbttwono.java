package guvi;
import java.util.*;
public class Armstrongbttwono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int first=sc.nextInt();
int last=sc.nextInt();
int rem=0,result;
for(int i=first;i<=last;i++)
{
	int temp=i;
	result=0;
	while(temp>0) {
	rem=temp%10;
	result+=rem*rem*rem;
	temp/=10;
	}
	if(i==result)
		System.out.println(i);
	
}
sc.close();
	}

}
