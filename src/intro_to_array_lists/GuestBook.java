package intro_to_array_lists;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton("Add Name");
	JButton b2 = new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();
public static void main(String[] args) {
GuestBook gb = new GuestBook();
gb.run();
}
public void run() {
p.add(b1);
p.add(b2);
frame.add(p);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b1.addActionListener(this);
b2.addActionListener(this);
frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == b1) {
		String input = JOptionPane.showInputDialog("Enter a name");
		names.add(input);
	}
	if (e.getSource() == b2) {
		for (int i = 0; i < names.size(); i++) {
		JOptionPane.showMessageDialog(null, names.get(i));
		}
		}
}
}
