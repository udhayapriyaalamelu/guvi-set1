package guvi;
import java.util.*;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int count=0;
while(num>0)
{
	int t=num%10;
	num=num/10;
	count++;
}
System.out.println(count);
sc.close();
	}

}
