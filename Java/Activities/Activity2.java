package Activity1;

public class Activity2 {
	
	
	
	public static void main(String[] args)
	{
		int arr[]= {10, 77, 10, 54, -11, 10};
		int len=arr.length;
		int flag=0;
		
		for (int i=0; i<=len-1; i++)
		{
			if(arr[i]==10)
			{
				flag=flag+arr[i];
			}
		}
		if (flag==30)
		{
			System.out.println("Value is equal to 30");
		}
		else
		{
			System.out.println("Value is not 30");
		}
		
	}

}
