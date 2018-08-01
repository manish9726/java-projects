import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {

		System.out.println("Enter any email address");
		Scanner in = new Scanner(System.in);
		String email = in.nextLine();

		if (email.indexOf("@") == email.lastIndexOf("@") && email.indexOf(".") == email.lastIndexOf(".")) {

			int at = email.indexOf("@");
			int dot = email.indexOf(".");

			if (at >= 4 && (dot - at) >= 3 && (email.length() - dot) >= 2) {

				System.out.println("Email is valid");
			} else {
				System.out.println("Sorry!Email is Invalid!!");
			}

		}

		else {
			System.out.println("Email is Invalid");
		}
	}
}
