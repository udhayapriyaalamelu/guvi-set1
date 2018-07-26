package guvi;
import java.util.*;
public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int f1=1,f2=1,f3=0;
System.out.print(f1+" "+f2);
for(int i=2;i<n;i++)
{
	f3=f1+f2;
	f1=f2;
	f2=f3;
	
	System.out.print(" "+f3);
}
	}

}
