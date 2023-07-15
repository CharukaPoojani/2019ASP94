abstract public class  LibraryItem {
	private String title;
	private String itemID;
	public boolean check = true;
	
	  
	  public  LibraryItem(String title, String itemID){
		  this.title = title;
		  this.itemID = itemID;
	  }
	  public String getTitle(){
		  return title;
	  }
	  public void setTitle(String title){
		  this.title = title;
	  }
	  public String getItemID(){
		  return itemID;
	  }
	  public void setItemID(String itemID){
		  this.itemID = itemID;
	  }
	  
	  public String getCheck(){
		  if(check){
			  return "Available";
		  }
		  else{
			  return "Not Available";
		  }
	  }
	  
	  public void displayItemDetails(){
		  System.out.println("Title of the item: " + getTitle());
		  System.out.println("ID of the item: " + getItemID());
	  } 
	  abstract public void checkOut();
	  abstract public void checkIn();
	    
}