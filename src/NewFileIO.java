package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class NewFileIO implements ActionListener {
	JFrame mononitiate;
	JPanel binitiate;
	JTextArea trinitiate;
	JButton bob;
	JButton yoblot;
	static int filenum = 0;

	public static void main(String[] args) {
		NewFileIO io = new NewFileIO();
		io.setGUI();
	}

	private void setGUI() {
		mononitiate = new JFrame("Mononitiate reporting for duty!");
		binitiate = new JPanel();
		trinitiate = new JTextArea(50, 50);
		bob = new JButton("load");
		yoblot = new JButton("save");
		bob.addActionListener(this);
		yoblot.addActionListener(this);
		mononitiate.add(binitiate);
		binitiate.add(trinitiate);
		binitiate.add(bob);
		binitiate.add(yoblot);
		mononitiate.pack();
		mononitiate.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(yoblot)) {
			// JOptionPane.showMessageDialog(null, "1");
			try {
				FileWriter na = new FileWriter("src/cheesechant" + filenum + ".txt");
				na.write(trinitiate.getText());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else {
			// JOptionPane.showMessageDialog(null, "2");
			try {
				FileReader na = new FileReader("src/cheesechant" + filenum + ".txt");
				BufferedReader an = new BufferedReader(na);

				try {
					String complete = "";
					String textget;
					textget = an.readLine();
					while (textget != null) {
						complete += textget;
						textget = an.readLine();
					}
					JOptionPane.showMessageDialog(null, complete);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
