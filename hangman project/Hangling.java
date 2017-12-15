import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Hangling {
	JFrame dark;

	JPanel hanglight;
	static int letters_in_word = -1;
	static int puznum;
	Stack<String> tracks;

	public static void main(String[] args) {
		Hangling soul = new Hangling();
		soul.ult();
	}

	private void ult() {
		tracks = new Stack<String>();
		dark = new JFrame("Hangling");
		hanglight = new JPanel();
		
		dark.add(hanglight);
		dark.setSize(1000, 600);
		addTrak(letters_in_word);
		dark.setVisible(true);
		showTrack();
	}

	private void showTrack() {
		while (!tracks.isEmpty()) {
			JLabel wew = new JLabel(tracks.pop());
			hanglight.add(wew);
			hanglight.repaint();
		}
	}

	private void addTrak(int numletters) {
		for (int letters = numletters; letters > 0; letters--) {
			JLabel labelette = new JLabel("_");
			hanglight.add(labelette);
			System.out.println("d");
		}
		hanglight.setPreferredSize(new Dimension(2000,2000));

		try {
			// Get the amount of lines
			LineNumberReader lnr = new LineNumberReader(new FileReader(new File("/usr/share/dict/words")));
			lnr.skip(Long.MAX_VALUE);// Skip to the end
			puznum = lnr.getLineNumber();// Get last line number
			lnr.close();
			String word;
			BufferedReader br = new BufferedReader(new FileReader(new File("/usr/share/dict/words")));
			while ((word = br.readLine()) != null) {
				tracks.add(word); // adds every line to the array
				System.out.println(word);
			}
			br.close();
		} catch (

		IOException e) {
			e.printStackTrace();
		}

	}
}
