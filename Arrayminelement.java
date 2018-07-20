package guvi;
import java.util.*;
public class Arrayminelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
		for(int i=1;i<n;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		System.out.println(small);
		sc.close();
	}

}
