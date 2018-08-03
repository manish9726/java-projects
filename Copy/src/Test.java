import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws InterruptedException,

			IOException {

		File source = new File("D:/Demo/vsc.exe");

		File dest = new File("D:/Demo/vsc4.exe");

		long start = System.currentTimeMillis();

		UltimateFastFileCopyDemo.copyFileUsingFileChannels(source, dest);

		long end = System.currentTimeMillis();

		System.out.println("Time taken by FileChannels Copy = " + (end - start));

	}
}
