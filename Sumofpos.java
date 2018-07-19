package guvi;
import java.util.*;
public class Sumofpos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int pos=sc.nextInt();
int arr[]=new int[n];
int sum=0;
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<pos;i++)
{
	sum+=arr[i];
}
System.out.println(sum);
sc.close();
	}

}
