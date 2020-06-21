package Exercise_03;

public class Book {

	private String isbn;
	private String title;
	private String author;
	private int numberOfPages;
	
	public Book(String isbn, String title, String author, int numberofPages) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.numberOfPages = numberofPages;
		
	}
	
	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "The Book \""+title+"\" with ISBN:" 
				+ isbn 
				+ " created by " 
				+ author+  " has "
				+ numberOfPages+" pages";
	}


}
