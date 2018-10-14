package test.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BookVO {

	private long bookId;
	private String bookName;
	private String author;

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookVO [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}

}
