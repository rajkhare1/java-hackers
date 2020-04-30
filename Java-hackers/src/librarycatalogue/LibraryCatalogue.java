package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
	
	// Properties/Fields/Global Variables
	Map<String, Book> bookCollection = new HashMap<String, Book>();
	int currentDay = 0;
	int lengthOfCheckedOutPeriod = 7;
	double intiailLateFee = 0.50;
	double feePerLateDay = 1.00;
	
	
	// Constructors
	public LibraryCatalogue(Map<String, Book> collection) {
		this.bookCollection = collection;
	}
	
	public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckedOutPeriod,
			double initialLateFee, double feePerLateDay) {
		this.bookCollection = collection;
		this.lengthOfCheckedOutPeriod = lengthOfCheckedOutPeriod;
		this.intiailLateFee = initialLateFee;
		this.feePerLateDay = feePerLateDay;
		
	}
	
	// Getters
	public Map<String, Book> getBookCollection(){
		return this.bookCollection;
	}
	
	public int getCurrentDay() {
		return this.currentDay;
	}
	
	public Book getBook(String bookTitle) {
		return getBookCollection().get(bookTitle);
	}
	
	public int getLengthOfCheckedOutPeriod() {
		return this.lengthOfCheckedOutPeriod;
	}
	
	public double getIntialLateFee() {
		return this.intiailLateFee;
	}
	
	public double getFeePerLateDay() {
		return this.feePerLateDay;
	}
	
	// SETTERS
	public void nextDay() {
		currentDay++;
	}
	
	public void setDay(int day) {
		this.currentDay = day;
	}
	
	// INSTANCE METHODS:
	
	public void checkOutBook(String title) {
	    Book book = getBook(title);
	    if(book.getIsCheckedOut()) {
	    	sorryBookAlreadyCheckedOut(book);
	    } else {
	    	book.setIsCheckedOut(true, currentDay);
	    	System.out.println("You just checked out "+ book.getTitle()+". It is due on day "+
	    	(getCurrentDay() + getLengthOfCheckedOutPeriod())+".");
	    }
	}
	
	public void returnBook(String title) {
		Book book = getBook(title);
		int daysLate = getCurrentDay() - (book.getDayCheckedOut() + getLengthOfCheckedOutPeriod());
		if(daysLate > 0) {
			System.out.println("You owe the Library $"+ (getIntialLateFee() + daysLate * getFeePerLateDay())+
					" because your book is "+daysLate +" days overdue");
		} else {
			System.out.println("Book Returned. Thank You!");
		}
		
		book.setIsCheckedOut(false, -1);
		
	}
	
	public void sorryBookAlreadyCheckedOut(Book book) {
		System.out.println("Sorry,  "+ book.getTitle() +" is already checked out. "+
	   "It should be back on day "+ (book.getDayCheckedOut() + getLengthOfCheckedOutPeriod())+".");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Book> bookCollection = new HashMap<String, Book>();
		Book harry = new Book("Harry Potter", 827132, 978-3-16-148410-0);
		bookCollection.put("Harry Potter", harry);
		LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
		lib.checkOutBook("Harry Potter");
		lib.nextDay();
		lib.nextDay();
		lib.nextDay();
		lib.checkOutBook("Harry Potter");
		lib.setDay(17);
		lib.returnBook("Harry Potter");
		lib.checkOutBook("Harry Potter");
		

	}

}
