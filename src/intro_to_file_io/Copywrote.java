package intro_to_file_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Copywrote {
	int bing = 0;
	String y;

	public static void main(String[] args) {
		Copywrote a = new Copywrote();
		a.gui();

	}

	private void gui() {
		JFileChooser jfc = new JFileChooser();

		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			if (jfc.getSelectedFile().listFiles() != null) {

				for (File file : jfc.getSelectedFile().listFiles()) {
					if (!file.isDirectory()) {

						try {
							FileWriter fw = new FileWriter(file, true);

							String appendologist = "@me 2017";
							String o = "// " + appendologist + "\n";
							/*
							 * NOTE: To append to a file that already exists, add true as a second parameter
							 * when calling the FileWriter constructor. (e.g. FileWriter fw = new
							 * FileWriter("src/intro_to_file_io/test2.txt", true);)
							 */

							fw.write(o);
							System.out.println(Base64.getEncoder().encodeToString(appendologist.getBytes()));
							fw.close();

						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

			}
		}
	}
}
// @me 2017
