package intro_to_file_io;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Four_Buttons implements ActionListener {
	JFrame demia;
	JPanel devit;
	JButton oneb;
	JButton twob;
	JButton threeb;
	JButton fourb;
	JButton fiveb;
	ArrayList<String> busyb;
	Rectangle dimensionalBox;
	int saveNum = 0;

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
		fiveb = new JButton("Show tasks");
		demia.add(devit);
		devit.add(oneb);
		devit.add(twob);
		devit.add(threeb);
		devit.add(fourb);
		devit.add(fiveb);
		oneb.addActionListener(this);
		twob.addActionListener(this);
		threeb.addActionListener(this);
		fourb.addActionListener(this);
		fiveb.addActionListener(this);
		demia.pack();
		dimensionalBox = demia.getBounds();
		demia.setVisible(true);
	}

	public void addtask() {
		String barrygang = JOptionPane.showInputDialog("Stayt thy task, Summoner!");
		busyb.add(barrygang);
	}

	public void removeTask(int numTask) {
		String fnd = busyb.get(numTask);
		if (fnd.length() > 0) {
			busyb.remove(fnd);
		}
	}

	public void saveTask(String advanced_savetry) {
		try {
			saveNum++;
			String saveNumber = "" + saveNum;
			FileWriter pointlessServant = new FileWriter("src/newtestsaver" + saveNumber + ".txt");
			
			pointlessServant.write(advanced_savetry);
			pointlessServant.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == oneb) {
			addtask();
		} else if (e.getSource() == threeb) {
			String jop = JOptionPane.showInputDialog("Input the number of task to remove (task conception number).");
			int index = Integer.parseInt(jop);
			String finalstring = busyb.get(index);
			System.out.println(finalstring);
			saveTask(finalstring);
		} else if (e.getSource() == twob) {
			String get = JOptionPane.showInputDialog("Input the number of task to remove (task conception number).");
			int communistrussIa = Integer.parseInt(get);
			communistrussIa--;
			try {

				if (busyb.contains(busyb.get(communistrussIa))) {
					removeTask(communistrussIa);
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		} else if (e.getSource() == fiveb) {
			String wizardry = "";
			for (String ing : busyb) {
				wizardry += "\n " + ing;
			}
			JOptionPane.showMessageDialog(null, wizardry);
		}
	}
}
