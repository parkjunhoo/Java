package chap07.oop.polymorphism;

public class DVD extends Content{

	private String genre;
	public DVD() {
		
	}
	
	public DVD(String title, String genre) {
		super(title);
		this.genre = genre;
	}
	
	
	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public void totalPrice() {
		switch(genre) {
			case "new":{
				setPrice(12000);
				break;
			}
			case "comic":{
				setPrice(11500);
				break;
			}
			case "child":{
				setPrice(11000);
				break;
			}
			default :{
				setPrice(10500);
			}
		}
	}
	
	
	
}
