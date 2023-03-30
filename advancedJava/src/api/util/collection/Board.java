package api.util.collection;

import java.util.Date;

public class Board {
	
	private int num;
	private String author;
	private String title;
	private Date date;
	private String content;
	
	public Board() {
		
	}
	
	
	
	public Board(int num, String author, String title, Date date, String content) {
		this.num = num;
		this.author = author;
		this.title = title;
		this.date = date;
		this.content = content;
	}

	

	@Override
	public String toString() {
		return "Board [num=" + num + ", author=" + author + ", title=" + title + ", date=" + date + ", content="
				+ content + "]";
	}



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
