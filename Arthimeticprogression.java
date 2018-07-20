package guvi;
import java.util.*;
public class Arthimeticprogression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int diff=sc.nextInt();
int n=sc.nextInt();
int sum=0;
for(int i=0;i<n;i++)
{
	sum+=a;
	a+=diff;
}
System.out.println(sum);
sc.close();
	}

}
