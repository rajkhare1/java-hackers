package librarycatalogue;

public class Book {
 
    // Properties, Fields, Global Variables
	private String title;
     private int pageCount;
     private int ISBN;
     private boolean isCheckedOut;// whether or not book checked out
     private int dayCheckedOut = -1;
     
    // Constructor
     public Book(String bookTitle, int bookPageCount, int bookISBN) {
    	 this.title = bookTitle;
    	 this.pageCount = bookPageCount;
    	 this.ISBN = bookISBN;
    	 isCheckedOut = false;
     }
     
     // Getters ---> INSTANCE METHOD
     public String getTitle() {
    	 return this.title;
     }
     
     public int getPageCount() {
    	 return this.pageCount;
     }
     
     public int getISBN() {
    	 return this.ISBN;
     }
     
     public boolean getIsCheckedOut() {
    	 return this.isCheckedOut;
     }
     
     public int getDayCheckedOut() {
    	 return this.dayCheckedOut; 
     }
     
     // SETTERS
     public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
    	 this.isCheckedOut = newIsCheckedOut;
    	 setDayCheckedOut(currentDayCheckedOut);
     }
     
     public void setDayCheckedOut(int day) {
    	  this.dayCheckedOut = day;
     }
     
     
     
     
     
}
