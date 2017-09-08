import javax.swing.JOptionPane;

// This recipe tells the user a knock-knock joke
//
// 1. Create a class called KnockKnock
// 2. Add a main method
// 3. Find your favorite knock-knock joke
// 4. Use pop-ups (JOptionPane.showMessageDialg) to display each line of the joke
public class KnockKnock {
	public static void main(String[] args) {
		JOptionPane.showInputDialog(null, "knock knock");
		JOptionPane.showInputDialog("Europe");
		JOptionPane.showMessageDialog(null, "No, your a poo!");
	}

}
