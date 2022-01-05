package activities;

public class MyBook extends Book
{
	
	
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.strTitle=title;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.strTitle;
	}
	

	public static void main(String[] args) {
		String title;
		// Create object of above class and call methods
		MyBook myBook = new MyBook();
		myBook.setTitle("Java");
		title = myBook.getTitle();
		System.out.println("Title of Book is="+title);

	}

}
