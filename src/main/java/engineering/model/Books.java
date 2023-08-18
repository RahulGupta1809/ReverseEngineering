package engineering.model;
// Generated Jul 28, 2023, 9:23:27 AM by Hibernate Tools 6.0.2.Final

/**
 * Books generated by hbm2java
 */
public class Books implements java.io.Serializable {

	private int booksId;
	private String booksName;
	private String bookAuthor;

	public Books() {
	}

	public Books(int booksId) {
		this.booksId = booksId;
	}

	public Books(int booksId, String booksName, String bookAuthor) {
		this.booksId = booksId;
		this.booksName = booksName;
		this.bookAuthor = bookAuthor;
	}

	public int getBooksId() {
		return this.booksId;
	}

	public void setBooksId(int booksId) {
		this.booksId = booksId;
	}

	public String getBooksName() {
		return this.booksName;
	}

	public void setBooksName(String booksName) {
		this.booksName = booksName;
	}

	public String getBookAuthor() {
		return this.bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

}
