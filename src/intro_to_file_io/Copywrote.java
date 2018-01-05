package intro_to_file_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

import javax.swing.JOptionPane;

public class Copywrote {
	int bing = 0;

	public static void main(String[] args) {
FileReader bong = new FileReader(file)
		for (int i = 0; i < args.length; i++) {

			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/incrptic.txt");
				String semic = JOptionPane.showInputDialog("Enter Text");

				/*
				 * NOTE: To append to a file that already exists, add true as a second parameter
				 * when calling the FileWriter constructor. (e.g. FileWriter fw = new
				 * FileWriter("src/intro_to_file_io/test2.txt", true);)
				 */

				fw.write("" + Base64.getEncoder().encodeToString(semic.getBytes()));
				System.out.println(Base64.getEncoder().encodeToString(semic.getBytes()));
				fw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
