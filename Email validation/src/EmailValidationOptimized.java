import java.util.Scanner;

public class EmailValidationOptimized {

	public static void main(String[] args) {

		System.out.println("Enter any email address");
		Scanner in = new Scanner(System.in);
		String email = in.nextLine();

		if (email.indexOf("@") == email.lastIndexOf("@") && email.indexOf(".") == email.lastIndexOf(".")
				&& email.indexOf("@") >= 4 && (email.indexOf(".") - email.indexOf("@")) >= 3
				&& (email.length() - email.indexOf(".")) >= 2) {

			System.out.println("Email is valid");
		} else {
			System.out.println("Sorry!Email is Invalid!!");
		}

	}
}
