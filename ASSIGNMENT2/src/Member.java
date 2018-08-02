import java.util.ArrayList;

public class Member {
	public  String name;
	private ArrayList<String> list = new ArrayList<String>();

	public Member() {

	}

	public Member(String name) {
		this.name = name;
	}

	public void setBooks(String book) {

		list.add(book);
	}
	
	public void getBooks() {
		System.out.println("Mr/Mrs " +name +" has books: ");
		for(String i: list) {
			
			System.out.println(i+ " ");
		}
		
	}
	
	public void removeBooks(String bookName) {
		
		list.remove(bookName);
	}

}
