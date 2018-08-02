
public class Test {
	public static void main(String[] args) {

		Books b1 = new Books("Book1");
		Books b2 = new Books("Book2");
		Books b3 = new Books("Book3");
		Member m1 = new Member("Manish");
		Member m2 = new Member("Prasanna");

		b1.issueBook(m1);
		b1.issueBook(m2);
		b1.returnBook();
		b1.issueBook(m2);
		b2.issueBook(m1);
		b3.issueBook(m1);
		m1.getBooks();
		m2.getBooks();

	}

}
