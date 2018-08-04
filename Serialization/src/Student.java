import java.io.Serializable;

public class Student implements Serializable {

	
	private int mat,eng,sci;
	private transient int  total;

	public Student() {
	}

	public Student(int mat, int eng, int sci) {
		this.mat = mat;
		this.eng = eng;
		this.sci = sci;
		this.total = mat+sci+eng;
	}
	
	
	public void result() {
		
		System.out.println("Maths: "+mat + "\tEnglish: "+eng +"\tScience: "+sci + "\tTotal: "+total);
	}
	
	
}
