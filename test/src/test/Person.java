package test;

public class Person implements Cloneable {

	private String name;
	private int age;

	public Person() {
		this("Anonymous", -1);

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private void print() {

		System.out.println("Name: " + name + " \tAge: " + age);
	}

	@Override
	public String toString() {
		return "Name: " + name + " \tAge: " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {

			Person p = (Person) obj;
			if (this.name == p.name && this.age == p.age)
				return true;

		}

		return false;

	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("No more!!");

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("manish", 21);
		Person pc = (Person) p1.clone();
		System.out.println(pc.name);
		// System.gc();
		// Person p1 = new Person("random", 41);
		//
		// Person p3 = new Person("random", 41);
		//
		// Person p2 = new Person("alex",20);
		//
		// System.out.println(p1.hashCode());
		// System.out.println(p3.hashCode());
		//
		// System.out.println(p1.equals(p3));
		//

	}

}
