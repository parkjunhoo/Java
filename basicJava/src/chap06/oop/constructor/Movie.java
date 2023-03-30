package chap06.oop.constructor;

public class Movie {
	private String title;
	private String genre;
	
	public Movie() {
		
	}
	public Movie(String title , String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	
	
	/////////////TITLE////////////////
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	/////////////////////////////
	
	//////////////GENRE///////////////
	public String getGenre(){
		return this.genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/////////////////////////////
	
	
	public void play() {
		System.out.println(
				String.format("%s (%s) 상영중입니다.", this.title , this.genre)
				);
	}
}
