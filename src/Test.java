
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={2,5,12,9,1};
		
		int target =11;
		
		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			
			for( int j=i; j<a.length;j++)
			{
				sum= a[j];
			}
			
			if(sum==target)
				System.out.println("sum is 11");
		}
	}

}
