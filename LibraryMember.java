public class LibraryMember{
	private String memberID;
	private String name;
	
	public LibraryMember(String memberID, String name){
		this.memberID = memberID;
		this.name = name;
	}
	
	public String getMemberID(){
		return memberID;
	}
	public void setMemberID(String memberID){
		this.memberID = memberID;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		this.name = name;
	}
	public void displayMemberDetails(){
		System.out.println("ID of the member: " +getMemberID());
		System.out.println("Name of the member: " +getName());
	}
	
	public static void main(String args[]){
		Book B1 = new Book("The Catcher in the Rye","B001","J.D. Salinger",240);
		Book B2 = new Book("To Kill a Mockingbird","B002","Harper Lee",281);
		Book B3 = new Book("1984","B003","George Orwell",328);
		Book B4 = new Book("Pride and Prejudice","B004","Jane Austen",432);
		Book B5 = new Book("The Hobbit","B005","J.R.R. Tolkien",320);
		
		Magazine M1 = new Magazine("National Geographic","M001","August 2023","National Geographic Society");
		Magazine M2 = new Magazine("Time","M002","September 2023","Time USA, LLC");
		Magazine M3 = new Magazine("Forbes","M003","June 2023","Forbes Media");
		Magazine M4 = new Magazine("Vogue","M004","July 2023","Condé Nast");
		Magazine M5 = new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		LibraryMember LM1 = new LibraryMember("L001","John Doe");
		LibraryMember LM2 = new LibraryMember("L002","Jane Smith");
		LibraryMember LM3 = new LibraryMember("L003","David Johnson");
		LibraryMember LM4 = new LibraryMember("L004","Sarah Williams");
		LibraryMember LM5 = new LibraryMember("L005","Michael Brown");
		
		B3.checkOut();
		M3.checkIn();
		
		B1.displayBookDetails();
		B2.displayBookDetails();
		B3.displayBookDetails();
		B4.displayBookDetails();
		B5.displayBookDetails();
		
		M1.displayMagazineDetails();
		M2.displayMagazineDetails();
		M3.displayMagazineDetails();
		M4.displayMagazineDetails();
		M5.displayMagazineDetails();
		
		LM1.displayMemberDetails();
		LM2.displayMemberDetails();
		LM3.displayMemberDetails();
		LM4.displayMemberDetails();
		LM5.displayMemberDetails();
	}
}