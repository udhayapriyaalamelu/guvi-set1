package guvi;
import java.util.*;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int large=0;
if(a>b)
	large=a;
if(b>c)
	large=b;
if(c>a)
	large=c;
System.out.println("large:"+large);
sc.close();
	}

}
