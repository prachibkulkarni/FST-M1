
public class ExceptionTest extends CustomException {

	public ExceptionTest()
	{
		
	}
	public ExceptionTest(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
	public void exceptionTest(String msg) throws CustomException 
	{
		if(msg==null) {
			throw new CustomException("Stirmg message is null");
		}
		else
		{
			System.out.println("String is valid as "+msg);
		}
	
	}
	

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		ExceptionTest excTest=new ExceptionTest();
		try
		{
			excTest.exceptionTest("this is valid string so need to print");
			excTest.exceptionTest(null);
		}
		catch(CustomException e)
		{
			System.out.println("Exception is thrown");
		}
	}

}
