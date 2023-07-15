public class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	public Book(String title, String itemID, String author, int numPages){
		super(title,itemID);
		this.author = author;
		this.numPages = numPages;
	}
	
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public int getNumPages(){
		return numPages;
	}
	public void SetNumPages(int numPages){
		this.numPages = numPages;
	}
	public void checkOut(){
		check = false;
	}
	public void checkIn(){
		check = true;
	}
	
	public void displayBookDetails(){
		System.out.println("Title of the item: " +super.getTitle());
		System.out.println("ID of the item: " +super.getItemID());
		System.out.println("Author of the book: " +getAuthor());
		System.out.println("Number of pages in the book: "+getNumPages());
		System.out.println("Availability of the book: "+super.getCheck());
		
	}
}