import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	
	public static void main(String[] args) throws IOException {
		FileInputStream istream = new FileInputStream("D:/Demo/vsc.exe");
		FileOutputStream ostream = new FileOutputStream("D:/Demo/vsc2.exe");
		long startTime = System.currentTimeMillis();
		int ch=0;
		while(true) {
			ch= istream.read();
			if(ch==-1) break;
			ostream.write(ch);
			
			
		}
		
		System.out.println("Time: "+ (System.currentTimeMillis() - startTime));
		ostream.close();
		istream.close();
	}
}
