
public class Books {

	private int count = 0;
	String mybook;
	Member member;

	public Books(String Bookname) {

		this.mybook = Bookname;
	}

	public void issueBook(Member member) {

		if (count == 0) {

			this.member = member;
			member.setBooks(mybook);
			System.out.println(mybook + " is given to " + member.name);
			count++;
		}

		else
			System.out.println(mybook + " is not available for "+member.name);
	}

	public void getMembers() {

		System.out.println(member.name);
	}

	public void returnBook() {

		count = 0;
		member.removeBooks(mybook);
		System.out.println(mybook + " is returned by " + member.name);
	}
}
