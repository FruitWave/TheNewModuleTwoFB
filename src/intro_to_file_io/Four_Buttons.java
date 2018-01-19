package intro_to_file_io;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Four_Buttons {
	JFrame demia;
	JPanel devit;
	JButton oneb;
	Jbutton twob;
	JButton threeb;
	Jbutton fourb;
	ArrayList<String> busyb;

	public static void main(String[] args) {
		Four_Buttons argoniti = new Four_Buttons();
		argoniti.solaet();
	}

	public void solaet() {
		busyb = new ArrayList<>(); 
		demia = new JFrame("inti comninti");
		devit = new JPanel();
		oneb = new JButton("Add Task");
		twob = new JButton("Remove Task");
		threeb = new JButton("Save");
		fourb = new JButton("Load");
		demia.add(devit);
		devit.add(oneb);
		devit.add(twob);
		devit.add(threeb);
		devit.add(fourb);
		demia.pack();
		demia.setVisible(true);
	}

	public void addtask() {
		String barrygang = JOptionPane.showInputDialog("Stayt thy task, Summoner!");
		busyb.add(barrygang);
	}
}
