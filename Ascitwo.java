package guvi;
import java.util.*;
public class Ascitwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
int swap;
for(int i=0;i<arr.length-1;i++)
{
	for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]>arr[j])
		{
			swap=arr[i];
			arr[i]=arr[j];
			arr[j]=swap;}}}
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
	}

}
