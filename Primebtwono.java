package guvi;
import java.util.*;
public class Primebtwono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int first=sc.nextInt();
int last=sc.nextInt();
int count=0;
while(first<last)
{
	count=0;
for(int i=2;i<=first/2;++i)
{
	if(first%i==0)
	{
		count=1;
		break;
	}
}
if(count==0)
	System.out.println(first);
	++first;
}
sc.close();
	}

}
