package guvi;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int rev=num;
int rem=0,revno=0;;
while(num!=0)
{
	rem=num%10;
	revno=revno*10+rem;
	num/=10;
}
if(rev==revno) {
System.out.println("Yes");
}else {
	System.out.println("No");
}sc.close();
	}

}
