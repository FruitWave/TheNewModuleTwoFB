package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Base64;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Uncrypt {

	public static void main(String[] args) {
		JFileChooser kfc = new JFileChooser();
		int returnVal = kfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try {
				String fileName = kfc.getSelectedFile().getAbsolutePath();
				FileReader formationassemble = new FileReader(fileName);
				BufferedReader reader = new BufferedReader(formationassemble);
				System.out.println(fileName);

				String line = reader.readLine();
				System.out.println(line);
				String uncrypted = new String(Base64.getDecoder().decode(line.getBytes()));

				while (line != null) {
					System.out.println(line);
					line = reader.readLine();
				}

				JOptionPane.showMessageDialog(null, uncrypted);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
// @me 2017
