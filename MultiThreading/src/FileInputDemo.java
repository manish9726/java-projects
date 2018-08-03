import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputDemo {

	public static void main(String[] args) throws Exception {
		String file = "D:/song.txt";
		FileInputStream istream = new FileInputStream(file);

		//1st approach
		
		byte[] bar = new byte[istream.available()];
		istream.read(bar);// reading stream bytes in stream
		String content = new String(bar);//converting byte array to string
		System.out.println(content);

		//2nd approach

		
		// int ch = 0;
		// while (true) {
		//
		// ch = istream.read(); // reading a byte from the stream
		// if (ch == -1) // EOF break the loop
		// break;
		// System.out.print((char)ch); // printing character
		// }

		istream.close();
	}

}
