package guvi;
import java.util.*;
public class Spacecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0;
	        Scanner s=new Scanner(System.in);
	        String val=s.nextLine();
	        int len=val.length();
	            for(int i=0;i<len;i++){
	                if(val.charAt(i)==' ')
	                    {
	                        continue;
	                    }
	                    sum++;
	                    }
	                    System.out.println(sum);
        }

}
