package guvi;
import java.util.*;
public class Eventwono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int last=sc.nextInt();
		for(int i=first+1;i<last;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		sc.close();
	}

}
