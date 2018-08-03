
public class TestEmployee {

	public static void main(String[] args) {

		Manager mgr = new Manager("Lili", 7000, 2000);
		showSalary(mgr);

		Executive exe = new Executive("ALEX", 7000, 1000);
		showSalary(exe);

	}

	private static void showSalary(Employee emp) {

		if (emp instanceof Manager)
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());
	}

	// private static void showSalary(Executive exe) {
	//
	// System.out.println("Executive Salary: " + exe.getSalary());
	// }
	//
	// private static void showSalary(Manager mgr) {
	//
	// System.out.println("Executive Salary: " + mgr.getSalary());
	//
	
//End}

}
