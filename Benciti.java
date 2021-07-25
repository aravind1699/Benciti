import java.util.Scanner;
import java.util.Vector;


public class test {
	public static void main(String[] args) {  
	Vector<Integer> v=new Vector<Integer>(); 
	int val=0,sum=0,it,ii=0,j=0;
	Scanner s=new Scanner(System.in);

	for(int i=0;i<6;i++)
	{
		val=s.nextInt();
		v.add(val);
	}
	while(ii<6)
	{
		sum=v.get(ii);
		it=ii+1;
		while(it<6)
		{
			sum=sum+v.get(it);
			if(sum==0)
			{
				
				j=1;
				break;
			}
			it++;
		}
  
		if(j==1)
		{
			val=ii;
			while(ii<=it)
			{
				v.remove(val);
				ii++;
			}
			break;
	    }
		ii++;
	}
System.out.println(v);
	
}  
}