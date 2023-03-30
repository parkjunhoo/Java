package chap07.oop.inheritance;


public class BookMgr {
	private Book[] bookList;
	public BookMgr(Book[] bookList) {
		this.bookList = bookList;
	}
	
	public void printBooklist(){
		for(int i =0; i<bookList.length; i++) {
			System.out.println(bookList[i].getTitle());
		}
	}
	
	public void printTotalPrice(){
		int sum = 0;
		for(int i=0; i<bookList.length; i++) {
			sum+= bookList[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+sum);
	}
}
