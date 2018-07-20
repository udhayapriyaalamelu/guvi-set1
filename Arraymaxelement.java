package guvi;
import java.util.*;
public class Arraymaxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int large=arr[0];
for(int i=1;i<n;i++)
{
	if(large<arr[i])
	{
		large=arr[i];
	}
}
System.out.println(large);
sc.close();
	}

}
