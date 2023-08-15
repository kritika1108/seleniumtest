import java.util.ArrayList;

public class CoreJava {

	public static void main(String[] args) {
		

		String s ="kritika";
		int k= 7;
		System.out.println(s+ k);

		int[] arr= new int[9];
		arr[0]=1;
		int[] arr2= {1,3,2,4,5,8,2,1};
		for(int i=0; i<8;i++) {


			if(arr2[i]%2==0)

			{	
				System.out.println(	arr2[i]+"is multiple of 2");
				break;
			}
			
			else
			{		System.out.println("is not");

			}
		}

		ArrayList<String> a= new ArrayList<>();
		a.add("kritika");
		a.add("goyal");
		System.out.println(a.get(1));

		String b= "Kritika Goyal Wns";
		String[] splitstring= b.split("Goyal");
		System.out.println(splitstring[0]);
		System.out.println(splitstring[1].trim());

		for(int i=0;i<b.length();i++) 
		{
			System.out.println(b.charAt(i));
		}

		 	for(int i=b.length()-1;i>=0;i--){
		 		System.out.println(b.charAt(i));
		 	}
	}
}
