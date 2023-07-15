public class Magazine extends LibraryItem{
	private String issueDate;
	private String publisher;
	
	public Magazine(String title, String itemID, String issueDate, String publisher){
		super(title,itemID);
		this.issueDate = issueDate;
		this.publisher = publisher;
	}
	public String getIssueDate(){
		return issueDate;
	}
	public void setIssueDate(){
		this.issueDate = issueDate;
	}
	public String getPublisher(){
		return publisher;
	}
	public void setPublisher(){
		this.publisher = publisher;
	}
	public void checkOut(){
		check = false;
	}
	public void checkIn(){
		check = true;
	}
	public void displayMagazineDetails(){
		System.out.println("Title of the item: " +super.getTitle());
		System.out.println("ID of the item: " +super.getItemID());
		System.out.println("Issue date of the magazine: " +getIssueDate());
		System.out.println("Publisher of the magazine: "+getPublisher());
		System.out.println("Availability of the book: "+super.getCheck());
		
	}
}