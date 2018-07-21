package guvi;
import java.util.*;
public class Ascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
Ascendingorder obj=new Ascendingorder();
int asi[]=obj.toAsceorder(arr);
for(int i=0;i<asi.length;i++)
{
	System.out.println(asi[i]);
}
}
public int[] toAsceorder(int[] arr) {
		// TODO Auto-generated method stub
	int swap;
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				swap=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=swap;
			}
		}
	}
	return arr;}
		/*int[] a={12,4,1,7,10,21,21,18,17,15,5,34,30};
		Ascendingorder sia=new Ascendingorder();
		  int[] asc=sia.toAsscendingOrder(a);
		  System.out.println(">>>>>>>asscending order>>>>>>");
		  for(int i=0;i<asc.length;i++){
		   System.out.print(asc[i]+"\t");
		  }
		 }
		  public int[] toAsscendingOrder(int[] a){
		  int swap;
		  for(int i=0;i<a.length-1;i++){
		   for(int j=0;j<a.length-1-i;j++){
		    if(a[j]>a[j+1]){
		     swap=a[j];
		     a[j]=a[j+1];
		     a[j+1]=swap;
		    }
		   } 
		  }
		   return a;
	}*/
}

